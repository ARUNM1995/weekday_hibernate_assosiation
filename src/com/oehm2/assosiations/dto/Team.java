package com.oehm2.assosiations.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "team")
public class Team implements Serializable {

	
	@Id
	@GenericGenerator(name = "team_auto", strategy = "increment")
	@GeneratedValue(generator = "team_auto")
	@Column(name = "team_id")
	private Long teamId;
	private String name;
	private Long size;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cap_id")
	private Captain captain;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public Captain getCaptain() {
		return captain;
	}

	public void setCaptain(Captain captain) {
		this.captain = captain;
	}
	
	
}

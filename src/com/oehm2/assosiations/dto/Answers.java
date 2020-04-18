package com.oehm2.assosiations.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "answers")
public class Answers implements Serializable{

	@Id
	@GenericGenerator(name = "a_auto",strategy = "increment")
	@GeneratedValue(generator = "a_auto")
	private Long aId;
	private String aName;
	private String type;
	
	public Answers() {
		// TODO Auto-generated constructor stub
	}

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}

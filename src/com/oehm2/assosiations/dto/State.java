package com.oehm2.assosiations.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "state")
public class State implements Serializable {

	@Id
	@GenericGenerator(name = "s_auto", strategy = "increment")
	@GeneratedValue(generator = "s_auto")
	private Long sId;
	private String name;
	private Long population;
	private String language;

	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	private Country country;
	
	public State() {
		// TODO Auto-generated constructor stub
	}

	public Long getsId() {
		return sId;
	}

	public void setsId(Long sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}

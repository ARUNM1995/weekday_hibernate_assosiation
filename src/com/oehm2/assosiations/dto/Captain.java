package com.oehm2.assosiations.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "captain")
public class Captain implements Serializable{
	
	@Id
	@GenericGenerator(name = "cap_auto", strategy = "increment")
	@GeneratedValue(generator = "cap_auto")
	private Long capId;
	private String name;
	private Long age;
	
	public Captain() {
		// TODO Auto-generated constructor stub
	}

	public Long getCapId() {
		return capId;
	}

	public void setCapId(Long capId) {
		this.capId = capId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}
	
	
	

}

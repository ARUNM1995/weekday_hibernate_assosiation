package com.oehm2.assosiations.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "questions")
public class Questions implements Serializable{

	
	@Id
	@GenericGenerator(name = "q_auto",strategy = "increment")
	@GeneratedValue(generator = "q_auto")
	private Long qId;
	private String qName;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(		name = "q_a_join",
					joinColumns = {
									@JoinColumn(name="q_id")
								   },
					inverseJoinColumns = {
											@JoinColumn(name="a_id")
										}
	         )
	private List<Answers> answers;
	
	
	public Questions() {
		// TODO Auto-generated constructor stub
	}


	public Long getqId() {
		return qId;
	}


	public void setqId(Long qId) {
		this.qId = qId;
	}


	public String getqName() {
		return qName;
	}


	public void setqName(String qName) {
		this.qName = qName;
	}


	public List<Answers> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	
	
	
	
}

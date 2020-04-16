package com.oehm2.assosiations.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "books")
public class Book implements Serializable{

	@Id
	@GenericGenerator(name = "book_auto", strategy = "increment")
	@GeneratedValue(generator = "book_auto")
	private Long bId;
	private String bookName;
	private String authorName;
	private Double  cost;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	
	
}

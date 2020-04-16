package com.oehm2.assosiations.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="library" )
public class Library implements Serializable{

	@Id
	@GenericGenerator(name = "lib_auto", strategy = "increment")
	@GeneratedValue(generator = "lib_auto")
	private Long lId;
	private String name;
	private Long totalBooks;
	private Long contact;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "f_id")
	private List<Book> books;
	
	public Library() {
	}


	public Long getlId() {
		return lId;
	}


	public void setlId(Long lId) {
		this.lId = lId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getTotalBooks() {
		return totalBooks;
	}


	public void setTotalBooks(Long totalBooks) {
		this.totalBooks = totalBooks;
	}


	public Long getContact() {
		return contact;
	}


	public void setContact(Long contact) {
		this.contact = contact;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
}

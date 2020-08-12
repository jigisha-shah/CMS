package com.jigisha.cms.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.stereotype.Component;

@Component
public class Book {

	
	@Pattern(regexp="^[0-9]{10}", message="exact 10 digits required")
	private String isbn;
	//@NotNull(message="can be empty and not null")
	//@NotBlank(message="not null and trimmed length is >0")
	@NotEmpty(message="not null and length>0")
	private String author;
	@NotNull(message="required field")
	@Min(value=1,message="copies between 1 to 10")
	@Max(value=10,message="copies between 1 to 10")
	private int copies;
	private String country; // dropDown
	private String[] gen; // checkbox
	private String type; // radio button
	
	@BookCode
	private String code;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getGen() {
		return gen;
	}
	public void setGen(String[] gen) {
		this.gen = gen;
	}
	
	
}

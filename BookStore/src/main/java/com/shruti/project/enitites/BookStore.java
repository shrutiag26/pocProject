package com.shruti.project.enitites;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

@Entity
public class BookStore {

	@Id
	private long id;

	@NotNull
	private String content;

	private String description;

	@NotNull
	private Double price;

	@NotNull
	private int quantity;

	@ManyToMany(mappedBy = "books", fetch = FetchType.LAZY)
	private Set<SignInfo> users = new HashSet<>();
	
	public BookStore() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookStore(long id, String content, String description, Double price) {
		super();
		this.id = id;
		this.content = content;
		this.description = description;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BookStore [id=" + id + ", content=" + content + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	
}

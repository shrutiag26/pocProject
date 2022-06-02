package com.shruti.project.enitites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddToCart {

	@Id
	private long pKey;
	private String content;
	private String description;
	private Double price;
	private int quantity;
	private long timestamp;
	private int addedCount;
	private boolean isOrdered = false;
	private int userId;
	private long id;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getpKey() {
		return pKey;
	}

	public void setpKey(long pKey) {
		this.pKey = pKey;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = new Date().getTime();
	}

	public int getAddedCount() {
		return addedCount;
	}

	public void setAddedCount(int addedCount) {
		this.addedCount = addedCount;
	}

	public boolean isOrdered() {
		return isOrdered;
	}

	public void setOrdered(boolean isOrdered) {
		this.isOrdered = isOrdered;
	}

	@Override
	public String toString() {
		return "AddToCart [pKey=" + pKey + ", content=" + content + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + ", timestamp=" + timestamp + ", addedCount=" + addedCount + ", isOrdered="
				+ isOrdered + "]";
	}

	public AddToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

}

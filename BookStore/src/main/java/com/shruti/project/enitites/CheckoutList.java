package com.shruti.project.enitites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CheckoutList {

	@Id
	private long timestamp;
	private long pKey;
	private long id;
	private String content;
	private String description;
	private Double price;
	private int quantity;
	private int addedCount;
	private long orderDate;
	private int userId;
	private boolean isDelivered;

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

	public long getpKey() {
		return pKey;
	}

	public void setpKey(long pKey) {
		this.pKey = pKey;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(long orderDate) {
		this.orderDate = orderDate;
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
		this.timestamp = timestamp;
	}

	public int getAddedCount() {
		return addedCount;
	}

	public void setAddedCount(int addedCount) {
		this.addedCount = addedCount;
	}

	@Override
	public String toString() {
		return "CheckoutList [timestamp=" + timestamp + ", pKey=" + pKey + ", id=" + id + ", content=" + content
				+ ", description=" + description + ", price=" + price + ", quantity=" + quantity + ", addedCount="
				+ addedCount + ", orderDate=" + orderDate + ", userId=" + userId + ", isDelivered=" + isDelivered + "]";
	}

	public CheckoutList() {
		super();
		// TODO Auto-generated constructor stub
	}
}

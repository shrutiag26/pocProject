package com.shruti.project.services;

import java.util.List;

import com.shruti.project.enitites.AddToCart;

public interface AddToCartServices {

	void addToCart(AddToCart book);

	void updateCount(AddToCart book);

	void deleteItemFromCart(long pkey);

	List<AddToCart> checkoutList();

	List<AddToCart> updateOrderList(List<AddToCart> order);

	void deleteAllItemsInCart(int userId);

}

package com.shruti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shruti.project.dao.AddToCartDao;
import com.shruti.project.enitites.AddToCart;

@Service
public class AddToCartServicesImpl implements AddToCartServices {

	@Autowired
	private AddToCartDao cartDao;

	@Override
	public void addToCart(AddToCart book) {
		cartDao.save(book);
	}

	@Override
	public void updateCount(AddToCart book) {
		cartDao.save(book);
	}

	@Override
	public void deleteItemFromCart(long pKey) {
		cartDao.deleteById(pKey);
	}

	@Override
	public List<AddToCart> checkoutList() {
		return cartDao.findAll();
	}

	@Override
	public List<AddToCart> updateOrderList(List<AddToCart> order) {
		for (AddToCart item : order) {
			item.setOrdered(true);
			cartDao.save(item);
		}
		return order;
	}

	@Override
	public void deleteAllItemsInCart(int userId) {
		List<AddToCart> cus = cartDao.findByUserId(userId);
		for (AddToCart user : cus) {
			cartDao.delete(user);
		}
	}

}

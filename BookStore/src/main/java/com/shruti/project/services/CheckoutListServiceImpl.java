package com.shruti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruti.project.dao.CheckoutDao;
import com.shruti.project.enitites.CheckoutList;

@Service
public class CheckoutListServiceImpl implements CheckoutListServices {

	@Autowired
	private CheckoutDao checkDao;

	@Override
	public void deleteOrderById(long timestamp) {
		checkDao.deleteById(timestamp);
	}

	@Override
	public List<CheckoutList> getCheckoutDetails() {
		return checkDao.findAll();
	}

	@Override
	public void setCheckoutDetails(List<CheckoutList> list) {
		checkDao.saveAll(list);

	}

	@Override
	public void setStatus(long timestamp) {
		CheckoutList value = checkDao.getById(timestamp);
		value.setDelivered(true);
		checkDao.save(value);
	}

}

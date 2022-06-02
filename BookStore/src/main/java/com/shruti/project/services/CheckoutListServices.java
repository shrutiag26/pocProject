package com.shruti.project.services;

import java.util.List;

import com.shruti.project.enitites.CheckoutList;

public interface CheckoutListServices {

	void deleteOrderById(long timestamp);

	List<CheckoutList> getCheckoutDetails();

	void setCheckoutDetails(List<CheckoutList> list);

	void setStatus(long parseLong);

}

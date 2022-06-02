package com.shruti.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shruti.project.enitites.CheckoutList;
import com.shruti.project.services.CheckoutListServices;

@RestController
public class CheckoutListController {

	@Autowired
	private CheckoutListServices checkout;

	@PostMapping("/setCheckoutDetails")
	public ResponseEntity<HttpStatus> setCheckoutDetails(@RequestBody List<CheckoutList> list) {
		try {
			this.checkout.setCheckoutDetails(list);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@DeleteMapping("/delete/order/{timestamp}")
	public ResponseEntity<HttpStatus> deleteOrderById(@PathVariable String timestamp) {
		try {
			this.checkout.deleteOrderById(Long.parseLong(timestamp));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getCheckoutDetails")
	public List<CheckoutList> getCheckoutDetails() {
		return this.checkout.getCheckoutDetails();
	}

	@PutMapping("/deliveryStatus/{timestamp}")
	public ResponseEntity<HttpStatus> setStatus(@PathVariable String timestamp) {
		try {
			this.checkout.setStatus(Long.parseLong(timestamp));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

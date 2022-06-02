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

import com.shruti.project.enitites.AddToCart;
import com.shruti.project.services.AddToCartServices;

@RestController
public class AddToCartController {

	@Autowired
	private AddToCartServices cartServices;

	@PostMapping("/addtocart")
	public ResponseEntity<HttpStatus> addToCart(@RequestBody AddToCart book) {
		try {
			this.cartServices.addToCart(book);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/update/count")
	public ResponseEntity<HttpStatus> updateCount(@RequestBody AddToCart book) {
		try {
			this.cartServices.updateCount(book);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		}
	}

	@DeleteMapping("/deleteitem/{pKey}")
	public ResponseEntity<HttpStatus> deleteItemFromCart(@PathVariable long pKey) {
		try {
			this.cartServices.deleteItemFromCart(pKey);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/checkout")
	public List<AddToCart> checkoutList() {
		return this.cartServices.checkoutList();
	}

	@PutMapping("/checkout/submit")
	public List<AddToCart> updateOrderList(@RequestBody List<AddToCart> order) {
		return this.cartServices.updateOrderList(order);
	}

	@DeleteMapping("/cleanpage/{userId}")
	public ResponseEntity<HttpStatus> deleteAllItemsInCart(@PathVariable String userId) {
		try {
			this.cartServices.deleteAllItemsInCart(Integer.parseInt(userId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}

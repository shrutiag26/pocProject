package com.shruti.project.controller;

import java.util.List;
import java.util.Optional;

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

import com.shruti.project.enitites.BookStore;
import com.shruti.project.services.BookStoreServices;

@RestController
public class BookStoreController {

	@Autowired
	private BookStoreServices bookservices;

	// homepage
	@GetMapping("/home")
	public String welcome() {
		return "Welcome";
	}

	// get store list
	@GetMapping("/storelist")
	public List<BookStore> getStoreList() {
		return this.bookservices.getStoreList();
	}

	// get single item
	@GetMapping("/storelist/{id}")
	public Optional<BookStore> getItem(@PathVariable String id) {
		return this.bookservices.getItem(Long.parseLong(id));
	}

	// add an item to list
	@PostMapping("/additem")
	public BookStore setItem(@RequestBody BookStore listItem) {
		return this.bookservices.setItem(listItem);
	}

	// update an item
	@PutMapping("/updateitem")
	public BookStore updateItem(@RequestBody BookStore listItem) {
		if (this.bookservices.findBook(listItem.getId()) != null)
			return this.bookservices.updateItem(listItem);
		return listItem;

	}

	// delete an item
	@DeleteMapping("/storelist/{id}")
	public ResponseEntity<HttpStatus> deleteItem(@PathVariable String id) {
		try {
			this.bookservices.deleteItem(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

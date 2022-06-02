package com.shruti.project.services;

import java.util.List;
import java.util.Optional;

import com.shruti.project.enitites.BookStore;

public interface BookStoreServices {

	public List<BookStore> getStoreList();

	public Optional<BookStore> getItem(long id);

	public BookStore setItem(BookStore listItem);

	public BookStore updateItem(BookStore listItem);

	public void deleteItem(long id);

	public BookStore findBook(long id);

}

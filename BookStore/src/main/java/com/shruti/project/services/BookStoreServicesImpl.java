package com.shruti.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shruti.project.dao.BookStoreDao;
import com.shruti.project.enitites.BookStore;

@Service
public class BookStoreServicesImpl implements BookStoreServices {

	@Autowired
	private BookStoreDao dao;

	@Override
	public List<BookStore> getStoreList() {

		return dao.findAll();
	}

	@Override
	public Optional<BookStore> getItem(long id) {

		return dao.findById(id);
	}

	@Override
	public BookStore setItem(BookStore listItem) {
		dao.save(listItem);
		return listItem;
	}

	@Override
	public BookStore updateItem(BookStore listItem) {
		BookStore book = dao.getById(listItem.getId());

		book.setContent(listItem.getContent());
		book.setDescription(listItem.getDescription());
		book.setPrice(listItem.getPrice());
		book.setQuantity(listItem.getQuantity());
		dao.save(listItem);
		return listItem;
	}

	@Override
	public void deleteItem(long id) {
		dao.deleteById(id);
	}

	@Override
	public BookStore findBook(long id) {
		return dao.findById(id).orElse(null);

	}

}

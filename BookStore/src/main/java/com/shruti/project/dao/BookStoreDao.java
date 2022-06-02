package com.shruti.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruti.project.enitites.BookStore;

@Repository
public interface BookStoreDao extends JpaRepository<BookStore, Long> {

}

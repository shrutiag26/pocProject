package com.shruti.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruti.project.enitites.AddToCart;

@Repository
public interface AddToCartDao extends JpaRepository<AddToCart, Long> {

	List<AddToCart> findByUserId(int userId);

}

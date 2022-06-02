package com.shruti.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruti.project.enitites.CheckoutList;

@Repository
public interface CheckoutDao extends JpaRepository<CheckoutList, Long>{

}

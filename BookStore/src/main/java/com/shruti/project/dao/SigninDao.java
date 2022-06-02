package com.shruti.project.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruti.project.enitites.SignInfo;

@Repository
public interface SigninDao extends JpaRepository<SignInfo, Integer> {

	Optional<SignInfo> findByUserName(String username);

}

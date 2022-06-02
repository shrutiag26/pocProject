package com.shruti.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruti.project.dao.SigninDao;
import com.shruti.project.enitites.SignInfo;

@Service
public class LoginServicesImpl implements LoginServices {

	@Autowired
	SigninDao signinDao;

	// to check if details are matching or not
	@Override
	public SignInfo login(SignInfo user) {
		List<SignInfo> list = signinDao.findAll();
		for (SignInfo customer : list) {
			if (customer.getUserName().equals(user.getUserName())) {
				if (customer.getPassword().equals(user.getPassword())) {
					user.setUserId(customer.getUserId());
					user.setRole(customer.getRole());
					return user;
				}
			}
		}
		return null;
	}

}

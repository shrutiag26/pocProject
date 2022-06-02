package com.shruti.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shruti.project.dao.SigninDao;
import com.shruti.project.enitites.SignInfo;

@Service
public class SigninServicesImpl implements SigninServices {

	@Autowired
	private SigninDao signinDao;

	@Override
	public List<SignInfo> getDetails() {
		return signinDao.findAll();
	}

	@Override
	public SignInfo setDetails(SignInfo info) {
		signinDao.save(info);
		return info;
	}

	@Override
	public Optional<SignInfo> getDetailsByUsername(String username) {
		return signinDao.findByUserName(username);

	}

	@Override
	public SignInfo findUsername(final String userName) {

		return signinDao.findByUserName(userName).orElse(null);
	}

}

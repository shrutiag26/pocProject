package com.shruti.project.services;

import java.util.List;
import java.util.Optional;

import com.shruti.project.enitites.SignInfo;

public interface SigninServices {

	public List<SignInfo> getDetails();
	
	public SignInfo setDetails(SignInfo info);
	
	public Optional<SignInfo> getDetailsByUsername(String userName);

	public SignInfo findUsername(String userName);

}

package com.shruti.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shruti.project.enitites.SignInfo;
import com.shruti.project.services.LoginServices;
import com.shruti.project.services.SigninServices;

@RestController
public class LoginInfoController {

	@Autowired
	LoginServices loginServices;

	@Autowired
	SigninServices signinServices;

	@PostMapping("/login")
	public SignInfo login(@RequestBody SignInfo user) {
		return this.loginServices.login(user);
	}
}

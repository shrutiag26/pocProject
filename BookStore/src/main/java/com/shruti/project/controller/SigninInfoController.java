package com.shruti.project.controller;

//import java.security.Principal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shruti.project.enitites.SignInfo;
//import com.shruti.project.jwt.JwtTokenProvider;
import com.shruti.project.services.SigninServices;

@RestController
public class SigninInfoController {

//	@Autowired
//	private JwtTokenProvider tokenProvider;

	@Autowired
	private SigninServices signinServices;

	// get signin info
	@GetMapping("/getDetails")
	public List<SignInfo> getDetails() {
		return this.signinServices.getDetails();
	}

	// get single login info by id
	@GetMapping("/getDetails/{userName}")
	public Optional<SignInfo> getDetailsByUsername(@PathVariable String userName) {
		return this.signinServices.getDetailsByUsername(userName);
	}

	// add user
	@PostMapping("/signin")
	public ResponseEntity<?> setDetails(@RequestBody SignInfo info) {
		if (this.signinServices.findUsername(info.getUserName()) != null) {
			return new ResponseEntity<HttpStatus>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<SignInfo>(this.signinServices.setDetails(info), HttpStatus.CREATED);
	}

//			@GetMapping("/login") 
//			public ResponseEntity<?> getUser(Principal principal) {
//				// principal = httpServletRequest.getUserPrincipal.
//				if (principal == null) { 
//					// logout will also use here so we should return ok http status.
//					return ResponseEntity.ok(principal);
//				}
//				UsernamePasswordAuthenticationToken authenticationToken = (UsernamePasswordAuthenticationToken) principal;
//				SignInfo user = signinServices.findByUsername(authenticationToken.getName());
//				user.setToken(tokenProvider.generateToken(authenticationToken));
//
//				return new ResponseEntity<SignInfo>(user, HttpStatus.OK);
//			}

}

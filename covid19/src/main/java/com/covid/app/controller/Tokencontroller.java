package com.covid.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid.app.jwt.util.JwtUtil;
import com.covid.app.model.User;
import com.covid.app.service.CustomUserDetailsService;

@RestController
public class Tokencontroller {
	@Autowired	
	private JwtUtil jwtUtil;
	@Autowired
    private CustomUserDetailsService service;

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody User authRequest) throws Exception {
		try {
			service.loadUserByUsername(authRequest.getUserName());
		} catch (Exception ex) {
			throw new Exception("inavalid username/password");
		}
		return jwtUtil.generateToken(authRequest.getUserName());
	}
}
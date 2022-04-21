package com.example.webdbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.webdbs.entity.User;

@Service
public interface UserServiceImpl {

	public User save(User user);
	
	public List<User> checkLogin(User user);
}

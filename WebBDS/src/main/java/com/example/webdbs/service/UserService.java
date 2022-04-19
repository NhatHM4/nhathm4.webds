package com.example.webdbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdbs.entity.User;
import com.example.webdbs.respository.UserRespository;
import com.example.webdbs.respository.impl.UserInterface;

@Service
public class UserService {
	
	@Autowired
	private UserRespository userInterface;
	
	public User save(User user) {
		return userInterface.save(user);
	}
	
	public List<User> checkLogin(User user){
		return userInterface.checkLogin(user);
	}
}
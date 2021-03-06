package com.example.webdbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdbs.entity.User;
import com.example.webdbs.respository.UserRepository;
import com.example.webdbs.service.impl.UserServiceImpl;

@Service
public class UserService implements UserServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> checkLogin(User user){
		return userRepository.findByNameAndPassword(user.getName(),user.getPassword());
	}
}

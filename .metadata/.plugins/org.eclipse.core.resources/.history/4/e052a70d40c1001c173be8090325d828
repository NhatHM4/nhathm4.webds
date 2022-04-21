package com.example.webdbs.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webdbs.entity.User;
import com.example.webdbs.respository.impl.UserInterface;



@Repository
public class UserRespository {
	
	@Autowired
	private UserInterface empIpml;
	
	public User save(User user) {
		return empIpml.save(user);
	}
	
	public List<User> checkLogin(User user) {
		return empIpml.findByNameAndPassword(user.getName(), user.getPassword());
	}
	
}

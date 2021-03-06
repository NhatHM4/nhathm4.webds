package com.example.webdbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.service.DuAnService;

@RestController
public class ShowListDuAnController {
	
	@Autowired
	private DuAnService duAnService;
	
	@GetMapping("/showlistapi")
	public List<DuAnBDS> findAll(){
		return duAnService.findAll();
	}
	
	
}

package com.example.webdbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.service.DuAnService;

@RestController
public class DeleteDuAnController {
	
	@Autowired
	private DuAnService duAnService;
	
	@PostMapping("/delete")
	public List<DuAnBDS> deleteDuAn(@RequestParam("id") Integer id){
		DuAnBDS duAn = duAnService.getById(id);
		duAn.setFlagDelete(true);
		duAnService.save(duAn);
		return duAnService.findAll();	
	}
	
	
}

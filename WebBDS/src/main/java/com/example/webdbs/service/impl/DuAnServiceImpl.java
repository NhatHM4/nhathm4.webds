package com.example.webdbs.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.webdbs.entity.DuAnBDS;

@Service
public interface DuAnServiceImpl {
	
	public DuAnBDS save(DuAnBDS duAnBDS);
	
	public List<DuAnBDS> findAll();
	
	public DuAnBDS getById(Integer id);
}

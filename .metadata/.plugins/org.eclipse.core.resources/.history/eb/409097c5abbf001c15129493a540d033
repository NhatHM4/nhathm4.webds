package com.example.webdbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.respository.DuAnRepository;

@Service
public class DuAnService {

	@Autowired
	private DuAnRepository duAnRepository;
	
	public DuAnBDS save(DuAnBDS duAnBDS) {
		return duAnRepository.save(duAnBDS);
	}
	
	public List<DuAnBDS> findAll(){
		return duAnRepository.findAll();
	}
}

package com.example.webdbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.respository.DuAnRepository;
import com.example.webdbs.service.impl.DuAnServiceImpl;



@Service
public class DuAnService implements DuAnServiceImpl {

	@Autowired
	private DuAnRepository duAnRepository ;
	
	public DuAnBDS save(DuAnBDS duAnBDS) {
		return duAnRepository.save(duAnBDS);
	}
	
	public List<DuAnBDS> findAll(){
		return duAnRepository.findAll();
	}
	
	public DuAnBDS getById(Integer id) {
		return duAnRepository.getById(id);
	}
}

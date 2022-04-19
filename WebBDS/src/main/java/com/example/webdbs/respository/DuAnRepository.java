package com.example.webdbs.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.webdbs.entity.DuAnBDS;
import com.example.webdbs.respository.impl.DuAnImpl;

@Repository
public class DuAnRepository {

	@Autowired
	private DuAnImpl duAnImpl;
	
	public DuAnBDS save(DuAnBDS duAnBDS) {
		return duAnImpl.save(duAnBDS);
	}
	
	public List<DuAnBDS> findAll(){
		return duAnImpl.findAll();
	}
}
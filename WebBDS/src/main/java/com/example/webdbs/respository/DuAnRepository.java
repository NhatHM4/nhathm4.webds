package com.example.webdbs.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.webdbs.entity.DuAnBDS;

@Repository
public interface DuAnRepository extends JpaRepository<DuAnBDS, Integer>{
	
	@Query("SELECT e FROM DuAnBDS e WHERE e.flagDelete = 0")
	List<DuAnBDS> findByFlagDelete();
}

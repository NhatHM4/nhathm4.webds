package com.example.webdbs.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.webdbs.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("SELECT e FROM User e WHERE e.name=?1 and e.password = ?2")
	List<User> findByNameAndPassword(String name,String password);
}

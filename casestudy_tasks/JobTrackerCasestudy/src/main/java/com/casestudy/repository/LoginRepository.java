package com.casestudy.repository;

import org.springframework.data.repository.CrudRepository;

import com.casestudy.model.Login;

public interface LoginRepository extends CrudRepository<Login, Integer> {
	public Login findByUser(String user);
}

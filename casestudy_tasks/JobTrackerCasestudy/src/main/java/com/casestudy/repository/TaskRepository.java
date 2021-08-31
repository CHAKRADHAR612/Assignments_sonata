package com.casestudy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.model.Task;
@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

}

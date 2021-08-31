package com.casestudy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.model.Task;
import com.casestudy.repository.TaskRepository;

@RestController
public class TaskController {
	@Autowired
	private TaskRepository repository;
	@GetMapping("/tasks")
	public List<Task> getAllTasks(){
		return (List<Task>) repository.findAll();
	}
	@GetMapping("/tasks/{taskId}")
	public Task getTaskById(@PathVariable Integer taskId) {
		Optional<Task> t=repository.findById(taskId);
		Task task=t.get();
		return task;
	}
	
	@PostMapping("/tasks")
	public String addTask(@RequestBody Task task) {
		repository.save(task);
		return "Task added successfully";
	}
	
	@PutMapping("/tasks/{taskId}")
	public String updateTask(@PathVariable Integer taskId,@RequestBody Task task) {
		Task task1=repository.findById(taskId).get();
		task1.setOwnerId(task.getOwnerId());
		task1.setCreatorId(task.getCreatorId());
		task1.setDescription(task.getDescription());
		task1.setName(task.getName());
		task1.setStatus(task.getStatus());
		task1.setPriority(task.getPriority());
		task1.setCreatedOn(task.getCreatedOn());
		task1.setStatusChangedOn(task.getStatusChangedOn());
		task1.setNotes(task.getNotes());
		task1.setIsBookmarked(task.getIsBookmarked());
		repository.save(task1);
		return "Task data updated successfully";
	}
	
	@DeleteMapping("/tasks/{taskId}")
	public String deleteTask(@PathVariable Integer taskId) {
		repository.delete(repository.findById(taskId).get());
		return "Task deleted successfully";
	}
}

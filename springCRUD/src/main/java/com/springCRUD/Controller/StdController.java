package com.springCRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springCRUD.Entity.Student;
import com.springCRUD.Repository.StdRepo;

@RestController
public class StdController {
	
	@Autowired
	private StdRepo repo;
	
	@GetMapping("/studentdetails")
	public List<Student> getAllStd(){
		return repo.findAll();
	}
	
	@PostMapping("/studentsave")
	public Student AddStudents(@RequestBody Student std) {
		return repo.save(std);
	}
	
	@PutMapping("studentupdate")
	public Student UpdateStd(@RequestBody Student std) {
		return repo.save(std);
	}
	
	@DeleteMapping("studentdelete/{id}")
	public void deleteStd(@PathVariable int id) {
		repo.deleteById(id);
	}
}

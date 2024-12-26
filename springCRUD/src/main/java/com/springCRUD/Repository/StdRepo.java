package com.springCRUD.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springCRUD.Entity.Student;

@Repository
public interface StdRepo extends JpaRepository<Student, Integer>{
}

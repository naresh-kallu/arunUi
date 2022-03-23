package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entity.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

}

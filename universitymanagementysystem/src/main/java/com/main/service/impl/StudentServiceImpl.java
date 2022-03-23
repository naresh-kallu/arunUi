package com.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.main.dao.StudentDao;
import com.main.entity.Student;
import com.main.service.IStudentService;

@Repository
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student saveStudent(Student student) {

		return studentDao.save(student);
	}

}

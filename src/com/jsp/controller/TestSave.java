package com.jsp.controller;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TestSave {
public static void main(String[] args) {
	Teacher teacher = new Teacher();
	
	teacher.setId(456);
	teacher.setName("Rishi");
	teacher.setEmail("Krishikesh899@gmail.com");
	teacher.setCno(64);
	
	TeacherDao teacherdao = new TeacherDao();
	Teacher t1 = teacherdao.saveTeacher(teacher);
	System.out.println(t1.getId());
	
	
}
}

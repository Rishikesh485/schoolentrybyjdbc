package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jsp.dto.Teacher;
import com.jsp.helper.HelperClass;

public class TeacherDao {
	
	HelperClass helperClass = new HelperClass();
	public Teacher saveTeacher (Teacher teacher) {
		Connection connection = helperClass.getConnection();
		String sql = "INSERT INTO teacher values(?,?,?,?)";
		try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, teacher.getId());
		preparedStatement.setString(2, teacher.getName());
		preparedStatement.setString(3, teacher.getEmail());
		preparedStatement.setInt(4, teacher.getCno());
		
		preparedStatement.execute();
		
		connection.close();
	}  catch(SQLException e) {
		e.printStackTrace();
	}
		return teacher;
}
}

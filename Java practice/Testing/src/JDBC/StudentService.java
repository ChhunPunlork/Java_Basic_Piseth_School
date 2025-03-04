package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentService {
	public void Save(Connection connection) {
		String sql = "INSERT INTO students(name, gender, grade) VALUES(?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "Chut Bunlong");
			preparedStatement.setString(2, "Male");
			preparedStatement.setInt(3, 12);
			int indexRow = preparedStatement.executeUpdate();
			if(indexRow> 0) {
				System.out.println("Insert successed!");
			}else{
				System.out.println("Insert not success!");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public void SaveStudent(Student student, Connection connection) {
		String sqlStatement = "INSERT INTO students(name, gender, grade) VALUES(?, ?, ?)";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getGender());
			preparedStatement.setInt(3, student.getGrade());
			
			int indexRow = preparedStatement.executeUpdate();
			if(indexRow > 0) {
				System.out.println("Insert success!");
			}else {
				System.out.println("Intsert not success");
			}
		} catch (SQLException e) {
			System.out.println("Intsert not success");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} 
	}
}

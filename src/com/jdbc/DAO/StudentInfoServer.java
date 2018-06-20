package com.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.Conn;
import com.model.StudentInfo;

public class StudentInfoServer {	
	private Connection conn = Conn.getConnection();
	private PreparedStatement ps;
	public boolean addStudent(StudentInfo s){
		final String sql= "insert into studentinfo values(null,?,?,?,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getOfClass());
			ps.setInt(3, s.getSex());
			ps.setString(4, s.getBirthday());
			ps.setString(5, s.getMajor());
			ps.setString(6, s.getCourse());
			ps.setString(7, s.getHobby());
			ps.setString(8, s.getBeizhu());
			
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	public List<StudentInfo> queryAllStudent(){
		List<StudentInfo> allStudent = new ArrayList<StudentInfo>();
		final String sql = "select * from studentinfo";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				StudentInfo s = new StudentInfo();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setOfClass(rs.getString("class"));
				s.setSex(rs.getInt("sex"));
				if(rs.getDate("birthday") != null)
					s.setBirthday(rs.getDate("birthday").toString());
				s.setMajor(rs.getString("major"));
				if(rs.getString("course") != null)
					s.setCourseArray(rs.getString("course").split(","));
				if(rs.getString("hobby") != null)
					s.setHobbyArray(rs.getString("hobby").split(","));
				s.setBeizhu(rs.getString("beizhu"));
				allStudent.add(s);
			}
			return allStudent;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public StudentInfo queryStudentById(int id){
		StudentInfo s = new StudentInfo();
		final String sql = "select * from studentinfo where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setOfClass(rs.getString("class"));
				s.setSex(rs.getInt("sex"));
				if(rs.getDate("birthday") != null)
					s.setBirthday(rs.getDate("birthday").toString());
				s.setMajor(rs.getString("major"));
				if(rs.getString("course") != null)
					s.setCourseArray(rs.getString("course").split(","));
				if(rs.getString("hobby") != null)
					s.setHobbyArray(rs.getString("hobby").split(","));
				s.setBeizhu(rs.getString("beizhu"));
				return s;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	public boolean updateStudent(StudentInfo s){
		final String sql = "update studentinfo set name=?,class=?,sex=?,birthday=?,major=?,"
							+"course=?,hobby=?,beizhu=? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, s.getName());
			ps.setString(2, s.getOfClass());
			ps.setInt(3, s.getSex());
			ps.setString(4, s.getBirthday());
			ps.setString(5, s.getMajor());
			ps.setString(6, s.getCourse());
			ps.setString(7, s.getHobby());
			ps.setString(8, s.getBeizhu());
			ps.setInt(9, s.getId());
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean delectStudent(int id){
		final String sql = "delete from studentinfo where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
}













package com.jdbc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.Conn;
import com.model.UserTable;

public class ValidateUser {
	public ValidateUser(){}
	private Connection conn=Conn.getConnection();
	public boolean valiUser(UserTable user){
		try {
			final String sql = "select * from usertable where username=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
}

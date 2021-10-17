package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.User;

public class RowMapperImpl implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
// rs se data nikal karr user m set krr diya 
		User user=new User();
		
		user.setUserName(rs.getString(1));           //first column
		user.setPassword(rs.getString(2));        //second column
		user.setWeight(rs.getInt(3));      // third column
		user.setHeight(rs.getInt(4));
		user.setAge(rs.getInt(5));
		user.setSex(rs.getString(6));
		return user;
	}
	

}

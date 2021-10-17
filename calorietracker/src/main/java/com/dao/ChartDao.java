package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dao.RowMapperImpl;
import com.entities.User;


public class ChartDao {
	@Autowired
	 JdbcTemplate jdbcTemplate;
	
	public User getUserDetails(String username) {
		String query="select * from user2 where userName=?";
		
		RowMapper<User> rowMapper=new RowMapperImpl();                  
		User user = this.jdbcTemplate.queryForObject(query, rowMapper, username);
		System.out.println("getting user"+user);
		return user;

        }

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}

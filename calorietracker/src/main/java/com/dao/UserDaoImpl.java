package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entities.User;

public class UserDaoImpl implements UserDao{
    @Autowired
	JdbcTemplate jdbcTemplate;
//to validate username and password
	public int validate(String userName, String password) {
		try {
		String query="select * from admin where username=? and password=?";
		RowMapper<User> rowMapper=new RowMapperImpl();  
		User user=this.jdbcTemplate.queryForObject(query, rowMapper, userName, password);
		return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
	}

//for register new user
	public int insert(User user) {
		String query="insert into user2 values(?,?,?,?,?,?)";
		int result = this.jdbcTemplate.update(query, user.getUserName(),user.getPassword(),user.getWeight(), user.getHeight(), user.getAge(),user.getSex());
		return result;
	}
//to update weight, height and age based on username and password
	public int update(User user) {
		String query="update user2 set weight=?, height=?, age=?, sex=? where userName=? and password=?";
		int result=this.jdbcTemplate.update(query, user.getWeight(), user.getHeight(), user.getAge(), user.getSex(), user.getUserName(), user.getPassword());
		
		return result;
	}
//to delete user based on username
	public int delete(String userName) {
		String query="delete from user2 where userName=?";
		int result = this.jdbcTemplate.update(query,userName);
		return result;
	}
//to view all the users
	public List<User> viewUsers() {
			String query="select * from user2";
			RowMapper<User> rowMapper=new RowMapperImpl();  
			List<User> users=this.jdbcTemplate.query(query,rowMapper);
			
			return users;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}

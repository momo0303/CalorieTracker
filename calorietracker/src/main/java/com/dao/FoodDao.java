package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entities.FoodIn;
import com.entities.User;

public class FoodDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<String> foodChoice() {
		String query="select distinct food_group from food_calories order by food_group";
		
		List<String> data = (List<String>)getJdbcTemplate().queryForList(query, String.class);
		System.out.println("momoomomomomo");
		 System.out.println("hey momo2"+data);
		 
		 return data;
	}
	
	public List<String> foodName(FoodIn fi) {
		System.out.println("from fooddao"+fi);
		
		String query="select distinct name from food_calories where food_group=? order by name";
		List<String> data = (List<String>)getJdbcTemplate().queryForList(query, String.class, fi.getFoodgroup());
		
		System.out.println("hey momo2"+data);
		
		 return data;
	}
	

}

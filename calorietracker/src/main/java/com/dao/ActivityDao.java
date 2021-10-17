package com.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class ActivityDao {
	
	JdbcTemplate jdbcTemplate;

	public List<String> fetchActivity()
	{
	String query="select distinct activity from met_values";
	
	List<String> data = (List<String>)getJdbcTemplate().queryForList(query, String.class);
	
	return data;
	
	}
	
	public List<String> fetchSpecificMotion(String activity)
	{
		String query="select distinct specific_motion from met_values where activity=? order by specific_motion";
		List<String> data = (List<String>)getJdbcTemplate().queryForList(query, String.class, activity);
		
		return data;
	}
	
	public float getMetValue(String specificMotion)
	{
		String query="select mets from met_values where specific_motion=?";
		
		float metValue = this.getJdbcTemplate().queryForObject(query, Integer.class, specificMotion);
		return metValue;
	}
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}

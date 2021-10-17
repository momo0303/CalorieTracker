package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.entities.CaloriesRecord;
import com.entities.Chart;
import com.entities.User;

public class NetCaloriesDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	Chart chart;
	
	public int checkData()
	{
		String query="select count(*) from calories_record where username=? and date=?";
		int r=this.getJdbcTemplate().queryForObject(query, Integer.class, chart.getUsername(), chart.getDate());
		System.out.println("from checkData():"+r);
		
		return r;
	}
	
	public int updateData(float netCalories)
	{
		String query="update calories_record set caloriesin=?, caloriesout=?, netcalories=? where username=? and date=?";
		int r=this.getJdbcTemplate().update(query,chart.getCaloriesin(), chart.getCaloriesout(), netCalories,
				chart.getUsername(), chart.getDate() );
		
		
		return r;
		
	}
	
	public int insertData(float bmr, float netCalories)
	{
		String query="insert into calories_record values(?,?,?,?,?,?)";
		
		int r=this.jdbcTemplate.update(query, chart.getUsername(), chart.getDate(), bmr,chart.getCaloriesin(), chart.getCaloriesout(), netCalories);
		
		return r;
	}
	
	public List<CaloriesRecord> seeAllData()
	{
		String query="select * from calories_record";
		RowMapper<CaloriesRecord> rowMapper=new LogsRowMapperImpl();  
		List<CaloriesRecord> caloriesRecord= this.jdbcTemplate.query(query,rowMapper);
		return caloriesRecord;
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Chart getChart() {
		return chart;
	}

	public void setChart(Chart chart) {
		this.chart = chart;
	}
	
	

}

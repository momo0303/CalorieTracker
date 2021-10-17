package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.entities.CaloriesRecord;



public class LogsRowMapperImpl implements RowMapper<CaloriesRecord>{

	public CaloriesRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
// rs se data nikal karr user m set krr diya 
		CaloriesRecord cr=new CaloriesRecord();
		
		cr.setUsername(rs.getString(1));           //first column
		cr.setDate(rs.getString(2));        //second column
		cr.setBmr(rs.getFloat(3));
		cr.setCaloriesin(rs.getFloat(4));
		cr.setCaloriesout(rs.getFloat(5));
		cr.setNetcalories(rs.getFloat(6));
	
		return cr;
	}
	

}
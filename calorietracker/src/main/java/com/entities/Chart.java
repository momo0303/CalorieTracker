package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.dao.ChartDao;
import com.dao.RowMapperImpl;
import com.entities.User;

public class Chart {
	@Autowired
	ChartDao chartdao;
	public static String username;
	public static int weight;
	public static int height;
	public static int age;
	public static String sex;
	
	public static String date;
	public static int caloriesin;
	public static float caloriesout;
	
	public static float bmr;
	
	
	public void calculateCaloriesOut(float metValues, int duration)
	{
		User user=(User)chartdao.getUserDetails(this.getUsername());
		this.setWeight(user.getWeight());
		this.setHeight(user.getHeight());
		this.setAge(user.getAge());
		this.setSex(user.getSex());
		System.out.println((float)metValues+" "+(float)weight+" "+(float)duration);
		caloriesout=caloriesout + ((float)metValues*(float)weight*((float)duration/60));
		System.out.println("clories outttt"+caloriesout);
		
	}


	public ChartDao getChartdao() {
		return chartdao;
	}


	public void setChartdao(ChartDao chartdao) {
		this.chartdao = chartdao;
	}


	public static String getUsername() {
		return username;
	}


	public static void setUsername(String username) {
		Chart.username = username;
	}


	public static int getWeight() {
		return weight;
	}


	public static void setWeight(int weight) {
		Chart.weight = weight;
	}


	public static int getHeight() {
		return height;
	}


	public static void setHeight(int height) {
		Chart.height = height;
	}


	public static int getAge() {
		return age;
	}


	public static void setAge(int age) {
		Chart.age = age;
	}


	public static String getSex() {
		return sex;
	}


	public static void setSex(String sex) {
		Chart.sex = sex;
	}


	public static String getDate() {
		return date;
	}


	public static void setDate(String date) {
		Chart.date = date;
	}


	public static int getCaloriesin() {
		return caloriesin;
	}


	public static void setCaloriesin(int caloriesin) {
		Chart.caloriesin = caloriesin;
	}


	public static float getCaloriesout() {
		return caloriesout;
	}


	public static void setCaloriesout(float caloriesout) {
		Chart.caloriesout = caloriesout;
	}


	@Override
	public String toString() {
		return "username"+username+"weight"+weight+"height"+height+"age"+age+"sex"+sex+"date"+date+"caloriesin"+caloriesin+"caloriesout"+caloriesout;
	}
	
	
	
}

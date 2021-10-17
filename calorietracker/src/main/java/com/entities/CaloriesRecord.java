package com.entities;

import javax.persistence.Id;
import javax.persistence.Table;
@Table
public class CaloriesRecord {
	@Id
	private String username;
	private String date;
	private float bmr;
	private float caloriesin;
	private float caloriesout;
	private float netcalories;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getBmr() {
		return bmr;
	}
	public void setBmr(float bmr) {
		this.bmr = bmr;
	}
	public float getCaloriesin() {
		return caloriesin;
	}
	public void setCaloriesin(float caloriesin) {
		this.caloriesin = caloriesin;
	}
	public float getCaloriesout() {
		return caloriesout;
	}
	public void setCaloriesout(float caloriesout) {
		this.caloriesout = caloriesout;
	}
	public float getNetcalories() {
		return netcalories;
	}
	public void setNetcalories(float netcalories) {
		this.netcalories = netcalories;
	}
	@Override
	public String toString() {
		return "CaloriesRecord [username=" + username + ", date=" + date + ", bmr=" + bmr + ", caloriesin=" + caloriesin
				+ ", caloriesout=" + caloriesout + ", netcalories=" + netcalories + "]";
	}
	

}

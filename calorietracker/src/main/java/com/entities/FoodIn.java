package com.entities;

public class FoodIn {
	
	private String date;
	private String mealtime;
	private String foodgroup;
	
	private String foodname;
	private int portion;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMealtime() {
		return mealtime;
	}
	public void setMealtime(String mealtime) {
		this.mealtime = mealtime;
	}
	public String getFoodgroup() {
		return foodgroup;
	}
	public void setFoodgroup(String foodgroup) {
		this.foodgroup = foodgroup;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public int getPortion() {
		return portion;
	}
	public void setPortion(int portion) {
		this.portion = portion;
	}
	@Override
	public String toString() {
		return "FoodIn [date=" + date + ", mealtime=" + mealtime + ", foodgroup=" + foodgroup + ", foodname=" + foodname
				+ ", portion=" + portion + "]";
	}
	
	

}

package com.dao;

import java.util.List;

import com.entities.User;

public interface UserDao {
	public int insert(User user);
	public int validate(String userName, String password);
	public int update(User user);
	public int delete(String userName);
	public List<User> viewUsers();

}

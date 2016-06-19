package com.lyh.itms.dao;

import java.util.List;
import java.util.Map;

import com.lyh.itms.domain.User;

public interface UserDao {
	
	int insert(User user);
	
	int delete(User user);
	
	int update(User user);
	
	User selectById(User user);
	
	int countUser(Map<String, Object> param);
	
	List<User> listPageUser(Map<String, Object> param);
	
}
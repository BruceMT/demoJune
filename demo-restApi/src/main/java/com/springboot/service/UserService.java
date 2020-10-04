package com.springboot.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.User;
import com.springboot.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public List<User> getUserList(){
		List<User> users = null;
		try {
			users =  userDao.getUserList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public User getUser(int id) {
		User user = null;
		try {
			user = userDao.getUserById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public void insertUser(User u) {
		
		try {
			userDao.insertUser(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User u,int id) {
		try {
			userDao.updateUserById(u, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertMulUser(List<User> users) {
		try {
			userDao.insertMulUser(users);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


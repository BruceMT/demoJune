package com.springboot.controller;
/**
 * @author: Weibin Ma
 * @description: REST Demo
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.bean.User;
import com.springboot.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value="/test")
	public String test() {
		return "test success";
	}
	
	@GetMapping(value="/user")
	public List<User> getUserList(){
		return userService.getUserList();
	}
	
	@GetMapping(value="/user/{id}")
	public User getUser(@PathVariable("id") int id) {
		return userService.getUser(id);
	}
	
	@PostMapping(value="/user")
	public String insertUser(User u) {
		userService.insertUser(u);
		return "success";
	}	
	
	@PutMapping(value="/user")
	public String updateUser(User u,int id) {
		userService.updateUser(u, id);
		return "success";
	}
	
	@PostMapping(value="/users")
	public String insertMulUser(List<User> users) {
		userService.insertMulUser(users);
		return "success";
	}

}


package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.property.WechatProperty;
import com.test.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private WechatProperty conf;
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<User> list(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int size) {
		System.out.println(conf);
		return userService.list(page, size);
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public User insert(User user) {
		return userService.insert(user);
	}
}

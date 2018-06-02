package com.test.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.User;
import com.test.mapper.UserMapper;
import com.test.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> list(Integer page, int Integer) {
		return userMapper.selectAll();
	}

	@Override
	public User insert(User user) {
		user.setId(UUID.randomUUID().toString());
		userMapper.insert(user);
		return user;
	}
	
	

}

package com.test.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.test.entity.User;

public interface UserService {

	/**
	 * 获取用户列表
	 * @param page 页号
	 * @param size 每页大小
	 * @return
	 */
	List<User> list(Integer page, int Integer);

	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	@Transactional
	User insert(User user);
	
}

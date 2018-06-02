package com.test.entity;

import javax.persistence.Id;

import lombok.Data;

@Data
public class User {

	@Id
	private String id;
	private String name;
}

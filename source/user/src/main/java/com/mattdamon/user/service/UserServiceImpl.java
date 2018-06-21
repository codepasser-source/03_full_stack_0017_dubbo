package com.mattdamon.user.service;

import org.springframework.stereotype.Service;

import com.mattdamon.user.model.User;

/**
 * 
 * @author <a>cheng.yy@neusoft.com</a>
 *
 * Copyright © 2001-2015 Neusoft-SY Corporation
 */
@Service
public class UserServiceImpl implements UserService {

	@Override
	public String getName() {
		User user = new User();
		user.setAge(19);
		user.setName("tom1");
		System.out.println(user);
		return user.getName();
	}

}

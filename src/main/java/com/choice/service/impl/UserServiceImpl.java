package com.choice.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.choice.dao.UserDao;
import com.choice.entity.User;
import com.choice.service.UserService;


@Service("userService")    
public class UserServiceImpl implements UserService {    
    @Resource    
    private UserDao userDao;

	@Override
	public User getUserById(int userId) {
		return userDao.getUserById(userId);
	}    
     
      
    
} 
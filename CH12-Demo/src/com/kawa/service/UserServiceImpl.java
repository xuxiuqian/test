package com.kawa.service;

import com.kawa.dao.UserDao;
import com.kawa.pojo.TUser;

public class UserServiceImpl implements UserService {
private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	@Override
	public int register(TUser user) {
		return userDao.addUser(user);
	}

	@Override
	public TUser login(String username, String password) {
		return userDao.getUser(username, password);
	}

}

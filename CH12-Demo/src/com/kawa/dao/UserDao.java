package com.kawa.dao;

import com.kawa.pojo.TUser;

public interface UserDao {
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	int addUser (TUser user);
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	TUser getUser(String username,String password);
}

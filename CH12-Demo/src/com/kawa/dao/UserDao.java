package com.kawa.dao;

import com.kawa.pojo.TUser;

public interface UserDao {
	/**
	 * �û�ע��
	 * @param user
	 * @return
	 */
	int addUser (TUser user);
	/**
	 * �û���¼
	 * @param username
	 * @param password
	 * @return
	 */
	TUser getUser(String username,String password);
}

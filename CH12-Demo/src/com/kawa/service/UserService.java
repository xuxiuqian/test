package com.kawa.service;

import com.kawa.pojo.TUser;

public interface UserService {
	/**
	 * ע��
	 * 
	 * @param users
	 * @return
	 */
	int register(TUser user);

	/**
	 * ��¼
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	TUser login(String username, String password);
}

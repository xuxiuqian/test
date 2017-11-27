package com.kawa.service;

import com.kawa.pojo.TUser;

public interface UserService {
	/**
	 * ×¢²á
	 * 
	 * @param users
	 * @return
	 */
	int register(TUser user);

	/**
	 * µÇÂ¼
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	TUser login(String username, String password);
}

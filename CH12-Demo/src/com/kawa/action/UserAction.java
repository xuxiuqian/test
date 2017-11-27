package com.kawa.action;

import com.kawa.pojo.TUser;
import com.kawa.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private TUser user;
	private String username;
	private String password;
	private String msg;
	
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public TUser getUser() {
		return user;
	}
	public void setUser(TUser user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String register(){
		int res = userService.register(user);
		if(res>0){
			return "success";
		}else{
			return "register";
		}
	}
	public String login(){
		TUser user = userService.login(username, password);
		if(null!=user){
			ActionContext.getContext().getSession().put("user", user);
			return "success";
		}
		msg = "用户名或密码不匹配";
		return "login";
	}

}

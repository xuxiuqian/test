package com.kawa.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kawa.pojo.TUser;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{


	
	
	@Override
	public int addUser(TUser user) {
		return (Integer) this.getHibernateTemplate().save(user);
	}

	@Override
	public TUser getUser(String username, String password) {
		List<TUser> users = this.getHibernateTemplate().find("from TUser where username=? and password=?", username,password);
		if(null==users||users.size()==0){
			return null;
		}
		return users.get(0);
	}
	
	
	
	
}

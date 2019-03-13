package com.jamininfo.modules.sys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jamininfo.modules.sys.bean.User;
import com.jamininfo.modules.sys.dao.LoginDao;

@Service
public class UserService {

	@Autowired
	private LoginDao loginDAO;

	public User getUser() {
		return loginDAO.getUser();
	}
}

/**
 * Copyright &copy; 2012-2016 <a href="http://www.whty.com.cn">whty</a> All rights reserved.
 */
package com.jamininfo.modules.sys.utils;

import com.jamininfo.common.utils.SpringContextHolder;
import com.jamininfo.modules.sys.bean.User;
import com.jamininfo.modules.sys.dao.UserDao;

/**
 * 用户工具类
 * @author whty
 * @version 2013-12-05
 */
public class UserUtils {

	private static UserDao userDao = SpringContextHolder.getBean(UserDao.class);

	/**
	 * 获取当前用户
	 * @return 取不到返回 new User()
	 */
	public static User getUser(){
		return userDao.getUser();
	}

}

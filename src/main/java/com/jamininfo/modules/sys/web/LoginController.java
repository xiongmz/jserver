package com.jamininfo.modules.sys.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jamininfo.modules.sys.bean.User;
import com.jamininfo.modules.sys.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping("/getUser")
	public User getUser() {
		return loginService.getUser();
	}
}

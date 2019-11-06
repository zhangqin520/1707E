package com.zhangqin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhangqin.bean.User;
import com.zhangqin.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService s;
	@RequestMapping("list")
	public String getlist(Model m) {
		List<User> list = s.getlist();
		m.addAttribute("list",list);
		return "list";
	}

}

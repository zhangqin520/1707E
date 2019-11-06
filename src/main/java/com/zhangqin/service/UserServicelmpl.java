package com.zhangqin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangqin.bean.User;
import com.zhangqin.mapper.UserMapper;
@Service
public class UserServicelmpl implements UserService {

	@Autowired
	private UserMapper m;
	@Override
	public List<User> getlist() {
		// TODO Auto-generated method stub
		return m.getlist();
	}

}

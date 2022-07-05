package com.condi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.condi.entity.Users;
import com.condi.entity.UsersDAO;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	@Qualifier("usersDAOImpl")
	private UsersDAO usersdao;
	
	@Override
	@Transactional
	public List<Users> getUsers() {
		return usersdao.getUsers();
	}

	@Override
	public Users getUser(int usersid) {
		// TODO Auto-generated method stub
		return usersdao.getUser(usersid);
	}

}

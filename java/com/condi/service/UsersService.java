package com.condi.service;

import java.util.List;

import com.condi.entity.Users;

public interface UsersService {
	public List<Users> getUsers();

	public Users getUser(int usersid);
}

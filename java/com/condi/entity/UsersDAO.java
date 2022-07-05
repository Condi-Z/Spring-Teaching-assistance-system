package com.condi.entity;

import java.util.List;

public interface UsersDAO {
	public List<Users> getUsers();

	public Users getUser(int usersid);
}

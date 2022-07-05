package com.condi.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Users> getUsers() {
		Session theSession = sessionFactory.getCurrentSession();
		Query<Users> userQuery = theSession.createQuery("from Users",Users.class);
		List<Users> userses = userQuery.getResultList();		

		return userses;
	}

	@Override
	public Users getUser(int usersid) {
		Session theSession = sessionFactory.getCurrentSession();
		Users user = theSession.get(Users.class, usersid);
		return user;
	}

}

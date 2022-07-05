package com.condi.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LogDAOImpl implements LogDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Log> getLogs() {
		Session theSession = sessionFactory.getCurrentSession();
		Query<Log> studentQuery = theSession.createQuery("from Log",Log.class);
		List<Log> logs = studentQuery.getResultList();		

		return logs;
	}

	@Override
	public void SaveLog(Log thelog) {
		Session theSession = sessionFactory.getCurrentSession();
		theSession.save(thelog);
	}

}

package com.condi.entity;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class TeacherDAOImpl implements TeacherDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Teacher> getTeachers() {
		Session theSession = sessionFactory.getCurrentSession();
		Query<Teacher> studentQuery = theSession.createQuery("from Teacher",Teacher.class);
		List<Teacher> teachers = studentQuery.getResultList();		

		return teachers;
	}

	@Override
	public void SaveTeachers(Teacher theteacher) {
		Session theSession = sessionFactory.getCurrentSession();
		//theSession.save(thestudent);
		theSession.saveOrUpdate(theteacher);
	}

	@Override
	public Teacher getTeacher(int teacherid) {
		Session theSession = sessionFactory.getCurrentSession();
		Teacher teacher = theSession.get(Teacher.class, teacherid);
		return teacher;
	}

	@Override
	public void deleteTeacher(int teacherid) {
		Session theSession = sessionFactory.getCurrentSession();
		Teacher teacher = theSession.get(Teacher.class, teacherid);
		theSession.delete(teacher);
	}

	@Override
	public void SaveStudents(Teacher theteacher) {
		Session theSession = sessionFactory.getCurrentSession();
		//theSession.save(thestudent);
		theSession.saveOrUpdate(theteacher);
		
	}

}

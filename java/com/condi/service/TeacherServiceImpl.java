package com.condi.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.condi.entity.Teacher;
import com.condi.entity.TeacherDAO;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	
	@Autowired
	@Qualifier("teacherDAOImpl")
	private TeacherDAO teacherdao;

	@Override
	@Transactional
	public List<Teacher> getTeachers() {
		
		return teacherdao.getTeachers();
	}

	@Override
	@Transactional
	public void SaveTeacher(Teacher theteacher) {
		teacherdao.SaveTeachers(theteacher);
		
	}

	@Override
	@Transactional
	public Teacher getTeacher(int teacherid) {
		
		return teacherdao.getTeacher(teacherid);
	}

	@Override
	@Transactional
	public void deleteTeacher(int teacherid) {
		teacherdao.deleteTeacher(teacherid);
		
	}

	@Override
	@Transactional
	public void SaveStudent(Teacher theteacher) {
		teacherdao.SaveStudents(theteacher);
		
	}

}

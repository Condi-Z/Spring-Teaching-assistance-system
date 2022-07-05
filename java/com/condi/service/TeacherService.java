package com.condi.service;

import java.util.List;

import com.condi.entity.Teacher;

public interface TeacherService {
	public List<Teacher> getTeachers();

	public void SaveTeacher(Teacher theteacher);

	public Teacher getTeacher(int teacherid);

	public void deleteTeacher(int teacherid);

	public void SaveStudent(Teacher theteacher);
}

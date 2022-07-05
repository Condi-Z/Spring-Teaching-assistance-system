package com.condi.entity;

import java.util.List;

public interface TeacherDAO {
	public List<Teacher> getTeachers();

	public void SaveTeachers(Teacher theteacher);

	public Teacher getTeacher(int teacherid);

	public void deleteTeacher(int teacherid);

	public void SaveStudents(Teacher theteacher);

}

package com.condi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="job")
	private String job;
	
	@Column(name="stime")
	private String stime;
	
	@Column(name="etime")
	private String etime;
	
	@Column(name="who")
	private String who;
	
	@Column(name="submit")
	private String submit;
	
	@Column(name="homework")
	private String homework;
	
	@Column(name="sname")
	private String sname;	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public String getEtime() {
		return etime;
	}

	public void setEtime(String etime) {
		this.etime = etime;
	}

	public String getWho() {
		return who;
	}

	public void setWho(String who) {
		this.who = who;
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit(String submit) {
		this.submit = submit;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Teacher() {

	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", job=" + job + ", stime=" + stime + ", etime=" + etime + ", who=" + who
				+ ", submit=" + submit + ", homework=" + homework + ", sname=" + sname + "]";
	}


}

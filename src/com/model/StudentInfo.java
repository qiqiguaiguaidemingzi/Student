package com.model;

public class StudentInfo {
	private int id;
	private String name;
	private String ofClass;
	private int sex;
	private String birthday;
	private String major;
	private String[] courseArray;
	private String course; 
	private String[] hobbyArray;
	private String hobby;
	private String beizhu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOfClass() {
		return ofClass;
	}
	public void setOfClass(String ofClass) {
		this.ofClass = ofClass;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String[] getCourseArray() {
		return courseArray;
	}
	public void setCourseArray(String[] courseArray) {
		this.courseArray = courseArray;
	}
	public String getCourse() {
		course = "";
		if(courseArray!=null){
			for(int i=0;i<courseArray.length;i++)
				course+=courseArray[i]+",";
			course=course.substring(0, course.length()-1);
		}
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getHobbyArray() {
		return hobbyArray;
	}
	public void setHobbyArray(String[] hobbyArray) {
		this.hobbyArray = hobbyArray;
	}
	public String getHobby() {
		hobby = "";
		if(hobbyArray!=null){
			for(int i=0;i<hobbyArray.length;i++)
				hobby+=hobbyArray[i]+",";
			hobby= hobby.substring(0, hobby.length()-1);
		}
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	
	
}

package com.capsule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeDetails")

public class EducationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String education;
    private String university;
    private String course;
    private String specilazation;
    private String courseType;
    private String startYear;
    private String endYear;
    private String gradingSystem;
    
    
	public EducationDetails() {
	
		// TODO Auto-generated constructor stub
	}
	public EducationDetails(long id, String education, String university, String course, String specilazation,
			String courseType, String startYear, String endYear, String gradingSystem) {
	
		this.id = id;
		this.education = education;
		this.university = university;
		this.course = course;
		this.specilazation = specilazation;
		this.courseType = courseType;
		this.startYear = startYear;
		this.endYear = endYear;
		this.gradingSystem = gradingSystem;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSpecilazation() {
		return specilazation;
	}
	public void setSpecilazation(String specilazation) {
		this.specilazation = specilazation;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getStartYear() {
		return startYear;
	}
	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public String getGradingSystem() {
		return gradingSystem;
	}
	public void setGradingSystem(String gradingSystem) {
		this.gradingSystem = gradingSystem;
	}
	
}

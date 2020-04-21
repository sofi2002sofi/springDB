package ua.lviv.iot.spring.labseven.rest.RestAplication.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name = "\"group\"") 
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
private  Integer enrollmentYear;
@OneToMany(mappedBy ="group",fetch =FetchType.EAGER)
@JsonIgnoreProperties("group")
private Set<Student> student;
public Set<Student> getStudent() {
	return student;
}
public void setStudent(Set<Student> student) {
	this.student = student;
}
public Group() {
	
}
public Group(String name,Integer enrollmentYear) {
	this.enrollmentYear=enrollmentYear;
	this.name=name;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getEnrollmentYear() {
	return enrollmentYear;
}
public void setEnrollmentYear(Integer enrollmentYear) {
	this.enrollmentYear = enrollmentYear;
}
}

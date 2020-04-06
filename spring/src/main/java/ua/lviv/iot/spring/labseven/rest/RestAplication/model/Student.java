package ua.lviv.iot.spring.labseven.rest.RestAplication.model;

import java.util.Set;

import javax.persistence.*;

//import org.hibernate.annotations.GeneratorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@NamedNativeQuery (name = "Student.findBestStudent", 
query = "select * from students where id = 1") 
public class Student {
	private String firsStudent;
	private String secondStudent;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Integer id;
	@ManyToOne(fetch =FetchType.EAGER) 
	@JoinColumn(name="group_id") 
	@JsonIgnoreProperties("students")
private Group group;
	
	@JsonIgnoreProperties("students")
	@ManyToMany(mappedBy = "students")
	private Set<Subject> subjects;
	
	public Student(String firstStudent, String secondStudent) {
		super();
	
		this.firsStudent = firstStudent;
		this.secondStudent = secondStudent;
	}

	public Student() {
	}

	public String getSecondStudent() {
		return secondStudent;
	}

	public void setSecondStudent(String secondStudent) {
		this.secondStudent = secondStudent;
	}

	public String getFirsStudent() {
		return firsStudent;
	}

	public void setFirsStudent(String firsStudent) {
		this.firsStudent = firsStudent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

}

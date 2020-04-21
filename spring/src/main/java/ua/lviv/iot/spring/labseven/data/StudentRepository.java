package ua.lviv.iot.spring.labseven.data;

import java.util.List;

import javax.persistence.NamedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Student;
@Repository
@NamedQuery(name= "FIND_BEST_STUDENT",query ="blablabla" )
public interface StudentRepository extends JpaRepository<Student, Integer> {
	List<Student>findAllByFirstName(String firstName);
	List<Student>findAllByFirstNameAndSecondName(String lastName,String secondStudent);
 

}

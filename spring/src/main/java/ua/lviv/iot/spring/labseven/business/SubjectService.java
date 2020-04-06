package ua.lviv.iot.spring.labseven.business;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.labseven.data.SubjectRepository;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Subject;


@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getAll(){
		return subjectRepository.findAll();
	}
	

}
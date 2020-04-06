package ua.lviv.iot.spring.labseven.rest.RestAplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ua.lviv.iot.spring.labseven.data.SubjectRepository;

import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Student;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Subject;

@RequestMapping("/subjects")
@RestController
public class SubjectController {
	@Autowired
	private SubjectRepository subjectRepository;
	@GetMapping
	public List<Subject> getAll(){
		return subjectRepository.findAll();
	}

}

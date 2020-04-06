package ua.lviv.iot.spring.labseven.rest.RestAplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.spring.labseven.data.GroupRepository;
import ua.lviv.iot.spring.labseven.rest.RestAplication.model.Group;

@RequestMapping("/groups")
@RestController
public class GroupsController {
	@Autowired
	private GroupRepository groupRepository;
	@GetMapping
	public List<Group> findAll(){
		return groupRepository.findAll();
	}

}

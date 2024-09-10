package springbootbasic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springbootbasic.domain.Person;
import springbootbasic.service.PersonService;

@RestController
public class PersonRestController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/getPerson")
	public Person getPerson() {
		return personService.getPerson();
	}
	
	@GetMapping("/getPersonList")
	public List<Person> getPersonList() {
		return personService.getPersonList();
	}	

} // class

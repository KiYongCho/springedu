package springmvc5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springmvc5.domain.Person;
import springmvc5.service.PersonService;

@RestController
public class PersonRestController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/person")
	public List<Person> getPersonList() {
		return personService.getPersonList();
	}
	
	@GetMapping("/person/{pid}")
	public Person getPerson(@PathVariable int pid) {
		return personService.getPerson(pid);
	}
	
	@PostMapping("/person")
	public List<Person> insertPerson(@RequestBody Person person) {
		return personService.insertPerson(person);
	}
	
	@PutMapping("/person")
	public List<Person> updatePerson(@RequestBody Person person) {
		return personService.updatePerson(person);
	}
	
	@DeleteMapping("/person/{pid}")
	public void deletePerson(@PathVariable int pid) {
		personService.deletePerson(pid);
	}
	
} // class

















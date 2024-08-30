package springmvc2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvc2.domain.Person;

@Controller
@RequestMapping(value="/person")
public class PersonController {
	
	@RequestMapping(value="/listPerson.do", method=RequestMethod.GET)
	public ModelAndView listPerson() {
		
		ModelAndView mav = new ModelAndView();
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("홍길동", 20));
		personList.add(new Person("강감찬", 30));
		personList.add(new Person("이순신", 40));
		
		mav.addObject("personList", personList);
		mav.setViewName("/person/listPerson");
		
		return mav;
		
	}
	
	@RequestMapping(value="/writePersonForm.do", method=RequestMethod.GET)
	public String writePersonForm() {
		return "/person/writePersonForm";
	}
	
	@RequestMapping(value="/writePersonProc.do", method=RequestMethod.POST)
	public ModelAndView writePersonProc(Person person) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("person", person);
		mav.setViewName("/person/writePersonResult");
		return mav;
	}
	
	@RequestMapping(value="/getPerson.do", method=RequestMethod.GET)
	public String getPerson(Model model) {
		model.addAttribute("person", new Person("장보고", 50));
		return "/person/getPerson";
	}

} // class













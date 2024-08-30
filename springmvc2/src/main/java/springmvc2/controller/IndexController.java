package springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index.do", method={RequestMethod.GET, RequestMethod.POST})
	public String index() {
		return "/index";
	}

}

package springaop.service;

import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public void printPerson() {
		System.out.println("<<< printPerson() 수행됨! >>>");
	}

	@Override
	public void getPerson() {
		System.out.println("<<< getPerson() 수행됨! >>>");
	}

}

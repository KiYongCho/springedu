package springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="springbootbasic")
public class HelloBootWebApp {

	public static void main(String[] args) {
		
		SpringApplication app 
			= new SpringApplication(HelloBootWebApp.class);
		app.setWebApplicationType(WebApplicationType.SERVLET);
		app.run(args);
		
	} // main
	
} // class






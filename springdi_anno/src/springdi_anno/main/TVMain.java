package springdi_anno.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springdi_anno.domain.TV;

public class TVMain {
	
	private ApplicationContext context;
	
	public TVMain() {
		context = new GenericXmlApplicationContext("/springdi_anno/conf/applicationContext.xml");
	}
	
	public static void main(String[] args) {
		
		TVMain tvmain = new TVMain();
		
		TV tv = (TV)tvmain.context.getBean("tv");
		System.out.println(tv);
		
		tv.getSpeaker().printName();
		
	}

}











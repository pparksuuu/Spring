package testPjt05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:application-context.xml");
		TransportationWalk transportationWalk = 
				ctx.getBean("transportationWalk", TransportationWalk.class);
		transportationWalk.move();
	}
}

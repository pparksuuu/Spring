package testPjt04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		TransportationWalk transportationWalk = new TransportationWalk();
//		transportationWalk.move();
		
		// Container를 가져온다. ! 리소스를 적어준다.
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:application-context.xml");
		
		// .getBean(bean의 id, data type)
		TransportationWalk transportationWalk = ctx.getBean("transportationWalk", TransportationWalk.class);
		transportationWalk.move();
		
		// resource 반환
		ctx.close();
	}
}

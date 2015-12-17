package fifth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-fifth.xml");
		
		Calculator calcImpl = ctx.getBean("calcImpl", Calculator.class); //그냥 실행되는것 즉, AOP가 실행되서 원래 목적인 성능 측정을 못함
		long fact1 = calcImpl.factorial(5);
		System.out.println("결과:"+ fact1);
		
		calcImpl = ctx.getBean("calcRecImpl", Calculator.class);
		long fact2 = calcImpl.factorial(5);
		System.out.println("결과:"+ fact2);

	}

}

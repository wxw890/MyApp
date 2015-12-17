package second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:spring-second.xml");
		MessageBean bean = ctx.getBean("messageBean", MessageBean.class); //그냥 실행되는것 즉, AOP가 실행되서 원래 목적인 성능 측정을 못함
		//bean = ctx.getBean("messageBean", MessageBean.class);//proxy를 이용해야 AOP를 실행하여 원래 목적인 성능 측정을 할 수 있게됨
		bean.sayHello();
		
	}
}

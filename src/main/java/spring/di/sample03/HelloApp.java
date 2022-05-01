package spring.di.sample03;

import org.springframework.context.support.GenericXmlApplicationContext;

// bean을 이용한 di
public class HelloApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:appCtx.xml");
		MessageBean bean = (MessageBean)ctx.getBean("messageBean");  
		// "messageBean"이름을 appCtx에서 "messageBean"이름을 가진 bean id 찾아서 객체 생성하고 받아옴
		bean.sayHello("Spring");
		ctx.close();
	}

}

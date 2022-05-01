package spring.di.sample04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:appCtx2.xml");
		MessageBean bean = (MessageBean)ctx.getBean("messageBean");  
		// "messageBean"이름을 appCtx에서 "messageBean"이름을 가진 bean id 찾아서 객체 생성하고 받아옴
		bean.sayHello("Spring");
		ctx.close();
	}

}

package spring.di.sample05;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:appCtx3.xml");
		OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean");  
		int value = operator.calc();
		System.out.println("result: " + value);
		ctx.close();
	}

}

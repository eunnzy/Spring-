package spring.auto.sample01;

import org.springframework.context.support.GenericXmlApplicationContext;

public class DiApp2 {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath*:appCtx4.xml");
		OperatorBean operator = (OperatorBean)ctx.getBean("operatorBean");  
		int value = operator.calc();
		System.out.println("result: " + value);
		ctx.close();
	}

}

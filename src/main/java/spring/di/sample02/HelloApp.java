package spring.di.sample02;

public class HelloApp {

	public static void main(String[] args) {
		MessageBean bean = new MessageBeanEn();
		// MessageBean bean = new MessageBeanKo();
		bean.sayHello("Spring");
	}

}

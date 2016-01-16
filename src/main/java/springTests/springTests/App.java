package springTests.springTests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springTests/springTests/applicationContext.xml");
		SampleBean message = (SampleBean) applicationContext.getBean("SampleBean");
		System.out.println(message.getName());
	}
}

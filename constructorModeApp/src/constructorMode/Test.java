package constructorMode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1.toString());

	}

}



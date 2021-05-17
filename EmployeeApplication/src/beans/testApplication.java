package beans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Modules.Department;
import Modules.Employee;

public class testApplication {
	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Employee e1 = (Employee)context.getBean("empone");
			e1.display();
			Department bean = (Department)context.getBean("dept1");
			bean.display();
			
		}

	}


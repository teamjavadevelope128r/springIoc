package in.nit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestingStudent {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		   Student a= context.getBean("stu",Student.class);
		    a.Display();

	}

}

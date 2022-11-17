package part03_exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
Service svc = (Service)context.getBean("svc");
svc.prn();
	}

}

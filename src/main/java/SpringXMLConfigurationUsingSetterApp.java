import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.springxmlconfig.service.UserService;

public class SpringXMLConfigurationUsingSetterApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println("Now retrieving first user...");
		System.out.println("user name = " + userService.getUsers().get(0).getUserName());
	}

}

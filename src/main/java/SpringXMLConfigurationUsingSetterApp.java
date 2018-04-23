import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.springxmlconfig.service.AdminService;
import com.ms.springxmlconfig.service.UserService;

public class SpringXMLConfigurationUsingSetterApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("");
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println("Now retrieving first user...");
		System.out.println("user name = " + userService.getUsers().get(0).getUserName());
		System.out.println("");
		AdminService adminService = appContext.getBean("adminService", AdminService.class);
		System.out.println("Now retrieving first admin...");
		System.out.println("admin name = " + adminService.getAdmins().get(0).getUserName());
		System.out.println("admin role = " + adminService.getAdmins().get(0).getRole());
	}

}

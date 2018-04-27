import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ms.springxmlconfig.service.AdminService;
import com.ms.springxmlconfig.service.GuestService;
import com.ms.springxmlconfig.service.UserService;

public class SpringXMLConfigurationDemo {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("");

		// xml configuration using property
		System.out.println("==== XML configuration using property ====");
		UserService userService = appContext.getBean("userService", UserService.class);
		System.out.println("Now retrieving first user...");
		System.out.println("user name = " + userService.getUsers().get(0).getUserName());
		System.out.println("");

		// xml configuration using constructor
		System.out.println("==== XML configuration using constructor ====");
		AdminService adminService = appContext.getBean("adminService", AdminService.class);
		System.out.println("Now retrieving first admin...");
		System.out.println("admin name = " + adminService.getAdmins().get(0).getUserName());
		System.out.println("admin role = " + adminService.getAdmins().get(0).getRole());
		System.out.println("");

		// Autowire using Constructor
		// note that the first argument inside getBean(...) method (guestServ in this
		// case) must match bean name in applicationContext.xml file.
		System.out.println("==== Autowire using constructor ====");
		GuestService guestServiceAutowireConstructor = appContext.getBean("guestServ", GuestService.class);
		System.out.println("Now retrieving first guest...");
		System.out.println("guest name = " + guestServiceAutowireConstructor.getGuests().get(0).getUserName());
		System.out.println("");

		// Autowire using byType
		System.out.println("==== Autowire using byType ====");
		GuestService guestServiceAutowireByType = appContext.getBean("guestService", GuestService.class);
		System.out.println("Now retrieving first guest pass...");
		System.out.println("guest pass number = " + guestServiceAutowireByType.getGuestPasses().get(0).getPassNumber());
		System.out.println("");

		// note that following should print false as we have three bean definitions for
		// GuestService in applicationContext.xml file.
		System.out.println(
				"appContext.getBean(\"guestServ\", GuestService.class) same object as appContext.getBean(\"guestService\", GuestService.class)? -> "
						+ ((guestServiceAutowireConstructor == guestServiceAutowireByType) ? true : false));
		System.out.println("");

		// Autowire using byName
		System.out.println("==== Autowire using byName ====");
		GuestService guestServiceAutowireByName = appContext.getBean("guestServiceByName", GuestService.class);
		System.out.println("Now retrieving first guest pass...");
		System.out.println("guest pass number = " + guestServiceAutowireByName.getGuestPasses().get(0).getPassNumber());
		System.out.println("");

		// note that following should print false as we have three bean definitions for
		// GuestService in applicationContext.xml file.
		System.out.println(
				"appContext.getBean(\"guestServiceByName\", GuestService.class) same object as appContext.getBean(\"guestService\", GuestService.class)? -> "
						+ ((guestServiceAutowireByName == guestServiceAutowireByType) ? true : false));
	}

}

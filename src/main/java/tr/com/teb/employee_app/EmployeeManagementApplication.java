package tr.com.teb.employee_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import tr.com.teb.employee_app.modal.entity.Employee;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	public static void lombokTest(){
		Employee employee = new Employee();

	}

}

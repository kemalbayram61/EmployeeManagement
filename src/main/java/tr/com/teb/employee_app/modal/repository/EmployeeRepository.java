package tr.com.teb.employee_app.modal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.teb.employee_app.modal.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

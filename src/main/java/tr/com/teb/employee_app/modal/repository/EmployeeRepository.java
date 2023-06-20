package tr.com.teb.employee_app.modal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.teb.employee_app.modal.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // SELECT * FROM EMPLOYEE WHERE SALARY >= ?
    List<Employee> findBySalaryGreaterThanEqual(double salary);

    // SELECT * FROM EMPLOYEE WHERE SALARY > ?
    List<Employee> findBySalaryGraterThan(double salary);
}

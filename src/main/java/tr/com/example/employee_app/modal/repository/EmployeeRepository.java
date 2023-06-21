package tr.com.example.employee_app.modal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tr.com.example.employee_app.modal.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // SELECT * FROM EMPLOYEE WHERE SALARY >= ?
    List<Employee> findBySalaryGreaterThanEqual(double salary);

    // SELECT * FROM EMPLOYEE WHERE SALARY > ?
    List<Employee> findBySalaryGreaterThan(double salary);
}

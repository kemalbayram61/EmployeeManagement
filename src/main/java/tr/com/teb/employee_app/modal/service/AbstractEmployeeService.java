package tr.com.teb.employee_app.modal.service;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.modal.repository.EmployeeRepository;

import java.util.List;

public abstract class AbstractEmployeeService implements EntityService<Employee, Integer>{

    @Autowired
    protected EmployeeRepository employeeRepository;

    protected abstract List<Employee> findBySalaryGreaterThanEqual(double salary);

    protected abstract List<Employee> findBySalaryGreaterThan(double salary);
}

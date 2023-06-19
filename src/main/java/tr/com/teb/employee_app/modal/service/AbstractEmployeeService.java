package tr.com.teb.employee_app.modal.service;

import tr.com.teb.employee_app.modal.entity.Employee;

import java.util.List;

public abstract class AbstractEmployeeService implements EntityService<Employee, Integer>{

    protected abstract List<Employee> findBySalaryGreaterThanEqual(double salary);

    protected abstract List<Employee> findBySalaryGreaterThan(double salary);
}

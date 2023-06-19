package tr.com.teb.employee_app.modal.service;

import tr.com.teb.employee_app.modal.entity.Employee;

import java.util.List;

public class EmployeeService extends AbstractEmployeeService{
    @Override
    protected List<Employee> findBySalaryGreaterThanEqual(double salary) {
        return null;
    }

    @Override
    protected List<Employee> findBySalaryGreaterThan(double salary) {
        return null;
    }

    @Override
    public Employee findByID(Integer id) {
        return null;
    }

    @Override
    public Employee update(Employee object) {
        return null;
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }

    @Override
    public Employee insert(Employee object) {
        return null;
    }
}

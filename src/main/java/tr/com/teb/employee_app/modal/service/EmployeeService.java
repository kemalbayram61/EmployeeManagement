package tr.com.teb.employee_app.modal.service;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.utility.Util;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeService extends AbstractEmployeeService{
    @Override
    protected List<Employee> findBySalaryGreaterThanEqual(double salary) {
        try{
            return employeeRepository.findBySalaryGreaterThanEqual(salary);
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    protected List<Employee> findBySalaryGreaterThan(double salary) {
        try{
            return employeeRepository.findBySalaryGreaterThan(salary);
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    public Employee findByID(Integer id) {
        try {
            return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Entity is not found."));
        }catch (NullPointerException nullPointerException){
            Util.showGeneralException(nullPointerException);
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (RuntimeException runtimeException){
            Util.showGeneralException(runtimeException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    public Employee update(Employee object) {
        Employee employeeFound = this.findByID(object.getEmployeeID());
        if(employeeFound != null)
        {
            employeeFound.setFirstName(object.getFirstName() != null ? object.getFirstName() : employeeFound.getFirstName());
            employeeFound.setLastName(object.getLastName() != null ? object.getLastName() : employeeFound.getLastName());
            employeeFound.setSalary(object.getSalary() < 0 ? object.getSalary() : employeeFound.getSalary());
        }
        return this.insert(employeeFound);
    }

    @Override
    public void deleteByID(Integer id) {
        try{
            employeeRepository.deleteById(id);
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
    }

    @Override
    public List<Employee> getAll() {
        try{
            return employeeRepository.findAll();
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    public Employee insert(Employee object) {
        try{
            object.setHireDate(new Date());
            return employeeRepository.save(object);
        }catch (IllegalArgumentException illegalArgumentException)
        {
            Util.showGeneralException(illegalArgumentException);
        }catch (OptimisticLockingFailureException optimisticLockingFailureException)
        {
            Util.showGeneralException(optimisticLockingFailureException);
        }catch (Exception exception)
        {
            Util.showGeneralException(exception);
        }
        return null;
    }
}

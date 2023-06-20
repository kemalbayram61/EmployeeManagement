package tr.com.teb.employee_app.modal.service;

import org.springframework.dao.OptimisticLockingFailureException;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.utility.Util;

import java.util.List;

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
            return employeeRepository.findBySalaryGraterThan(salary);
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    public Employee findByID(Integer id) {
        try{
            return employeeRepository.findById(id).get();
        }catch (IllegalArgumentException illegalArgumentException){
            Util.showGeneralException(illegalArgumentException);
        }catch (Exception exception){
            Util.showGeneralException(exception);
        }
        return null;
    }

    @Override
    public Employee update(Employee object) {
        return this.insert(object);
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

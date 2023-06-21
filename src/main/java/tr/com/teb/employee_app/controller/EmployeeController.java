package tr.com.teb.employee_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.modal.service.AbstractEmployeeService;

import java.util.Date;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private AbstractEmployeeService employeeService;

    @RequestMapping("/")
    public String startIndexPage(Model model){
        List<Employee> employeeList = employeeService.getAll();
        model.addAttribute("employeeList", employeeList);
        return "index";
    }

    @RequestMapping("/show/employee-registration")
    public String employeeRegistration(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee_registration";
    }

    @RequestMapping("/register/employee")
    public String registerEmployee(Employee employee){
        employee.setHireDate(new Date());
        employeeService.insert(employee);
        return "redirect:/";
    }

    @RequestMapping("/delete/employee/{employeeID}")
    public String deleteEmployee(@PathVariable(value = "employeeID") Integer employeeID){
        employeeService.deleteByID(employeeID);
        return "redirect:/";
    }

    @RequestMapping("/show/employee-editing/{employeeID}")
    public String showEmployeeEditing(@PathVariable(value = "employeeID") Integer employeeID, Model model){
        Employee employee = employeeService.findByID(employeeID);
        model.addAttribute("employee", employee);
        return "employee_edit";
    }

    @RequestMapping("/edit/employee")
    public String editEmployee(Employee employee){
        employeeService.update(employee);
        return "redirect:/";
    }

}

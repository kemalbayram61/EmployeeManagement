package tr.com.teb.employee_app.controller;

import javafx.stage.Modality;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.modal.service.AbstractEmployeeService;

import java.time.LocalDate;
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
        employeeService.insert(employee);
        return "redirect:/";
    }

}

package tr.com.teb.employee_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.teb.employee_app.modal.entity.Employee;
import tr.com.teb.employee_app.modal.service.AbstractEmployeeService;

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

}

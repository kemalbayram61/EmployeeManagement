package tr.com.teb.employee_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import tr.com.teb.employee_app.modal.service.AbstractEmployeeService;

@Controller
public class EmployeeController {
    @Autowired
    private AbstractEmployeeService employeeService;
    public String startIndexPage(Model model){
        return "index";
    }

}

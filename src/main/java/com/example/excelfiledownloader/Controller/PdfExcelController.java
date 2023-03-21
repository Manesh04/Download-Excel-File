package com.example.excelfiledownloader.Controller;

import com.example.excelfiledownloader.Model.Employee;
import com.example.excelfiledownloader.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class PdfExcelController {

    @Autowired
    private EmployeeService employeeService;

    public String allEmployees(Model model){

        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "view/employees";
    }

}

package com.controller;
import java.util.List;


import com.dao.DepartmentDAO;
import com.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MainController {
    @Autowired
    private DepartmentDAO departmentDAO;
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String welcomePage(Model model) {
        departmentDAO.insertDepartment("HR", "Odessa");
        departmentDAO.insertDepartment("DEV", "Odessa");
        departmentDAO.insertDepartment("QA", "Odessa");
        List<Department> list = departmentDAO.listDepartment();
        model.addAttribute("departments", list);
        return "index";
    }
}

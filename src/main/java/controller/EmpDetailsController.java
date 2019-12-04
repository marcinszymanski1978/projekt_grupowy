package controller;

import hibernate.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class EmpDetailsController {

    private Employees employees;
    private HibernateDao employeeDao;
    private List<Employees> list = new ArrayList<>();

    public EmpDetailsController(){
        employeeDao = new HibernateDao();
    }

    @RequestMapping(value ="/showEmp/{id}")
    public ModelAndView showEmp(Model model, @PathVariable String id){

        list.clear();
        list = employeeDao.getEmployees();
        employees = getEmployeesById(Integer.parseInt(id));

        Set<Cars> carSet = employees.getCars();
        Set<Phones> phonesSet = employees.getPhones();
        Set<Printer> printerSet = employees.getPrinters();

        model.addAttribute("employee", employees);
        model.addAttribute("carSet", carSet);
        model.addAttribute("phonesSet", phonesSet);
        model.addAttribute("printerSet", printerSet);

        return new ModelAndView("showEmp", "list", list);
    }

    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }

}

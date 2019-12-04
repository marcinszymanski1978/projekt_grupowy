package controller;

import hibernate.*;
import hibernate.Cars;
import hibernate.Employees;
import hibernate.Phones;
import hibernate.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
public class EmpController {

    private List<Employees> list = new ArrayList<>();
    private HibernateDao employeeDao;
    Employees employees;


    public EmpController() {
        employeeDao = new HibernateDao();
        Employees employees = new Employees();
    }

    @RequestMapping("/empform")
    public ModelAndView showform(){
        return new ModelAndView("empform","command", new Employees());
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employees") Employees employee){
        if(employee.getId()!=null){
            employeeDao.updateHibernateEntity(employee);
        }
        employeeDao.saveHibernateEntity(employee);

        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/delete", method=RequestMethod.POST)
    public ModelAndView delete(@RequestParam String id){
        employeeDao.deleteHibernateEntity(getEmployeesById(Integer.parseInt(id)));
        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public ModelAndView edit(@RequestParam String id){
        Employees employees = getEmployeesById(Integer.parseInt(id));
        return new ModelAndView("empform","command", employees);
    }
    @RequestMapping(value="/show", method=RequestMethod.POST)
    public ModelAndView show(@RequestParam String id, Model model){
        Employees employees = getEmployeesById(Integer.parseInt(id));
        Set<Phones> phonesSet = employees.getPhones();
        Set<Cars> carsSet = employees.getCars();
        Set<Printer> printerSet = employees.getPrinters();
        model.addAttribute("employees", employees);
        model.addAttribute("phoneSet", phonesSet);
        model.addAttribute("carsSet", carsSet);
        model.addAttribute("printerSet", printerSet);
        return new ModelAndView("showEmp");
    }


    @RequestMapping("/viewemp")
    public ModelAndView viewemp(){
        list.clear();
        list = employeeDao.getEmployees();
        return new ModelAndView("viewemp","list", list);
    }


    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}
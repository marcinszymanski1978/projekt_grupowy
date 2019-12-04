package controller;

import hibernate.HibernateDao;
import hibernate.Employees;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmpController {

    private List<Employees> list = new ArrayList<>();
    private HibernateDao employeeDao;
    Employees employees;


    public EmpController() {
        employeeDao = new HibernateDao();
    }

    @RequestMapping("/empform")
    public ModelAndView showform(){
        return new ModelAndView("empform","command", new Employees());
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employees") Employees employee){
        if(employee.getId() == 0) {
            employee.setId(list.size()+1);
            employeeDao.saveHibernateEntity(employee);
        } else {
            employeeDao.updateHibernateEntity(employee);
        }
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
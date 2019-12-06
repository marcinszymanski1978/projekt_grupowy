package controller;

import hibernate.*;
import mail.SendEmail;
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
    private SendEmail sendEmail = new SendEmail();

    public EmpController() {
        employeeDao = new HibernateDao();
    }

    @RequestMapping("/empform")
    public ModelAndView showform(){
        return new ModelAndView("empform","command", new Employees());
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employees") Employees employee/* @ModelAttribute("avatar") Avatar avatar*/){
        if(employee.getId()!=null){
//            update
            List<Employees> employeesList = employeeDao.getEmployees();
            Employees employeesBeforeUpdate = employeesList.stream().filter(f -> f.getId().equals(employee.getId())).findFirst().get();
            employeeDao.updateHibernateEntity(employee);
            String message = sendEmail.prepareMessage(employeesBeforeUpdate, employee);
            sendEmail.sendEmail(message, employee);

        } else {
//            add
            List employeesList = employeeDao.getEmployees();
            employee.setId(employeesList.size() + 1);
            employeesList.add(employee);
            employeeDao.saveHibernateEntity(employee);

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

    @RequestMapping(value="/start", method=RequestMethod.POST)
    public ModelAndView start(){
        System.out.println("Back to Home Page");
        return new ModelAndView("redirect:/");}

    @RequestMapping(value="/test", method=RequestMethod.POST)
    public ModelAndView test(){
        System.out.println("Test");
        return new ModelAndView("redirect:/viewemp");
    }


    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }
    /*@RequestMapping(value="/addImage", method = RequestMethod.POST)
    public String addImage(@RequestParam String imageURL, @RequestParam String id){

        AvatarService avatarService = new AvatarService();
        avatarService.addImageToDatabase();
        return "showEmp";
    }*/

}
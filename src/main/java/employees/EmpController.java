package employees;

import hibernate.*;
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
    private List<Employees> employeesList;
    private List<Phones> phonesList;
    private List<Cars> carsList;
    private List<Printer> printerList;


    public EmpController() {
        HibernateDao employeeDao = new HibernateDao();
        employeesList = employeeDao.getEmployees();
        phonesList = employeeDao.getPhones();
        carsList = employeeDao.getCars();
        printerList = employeeDao.getPrinter();
    }

    @RequestMapping("/empform")
    public ModelAndView showform(){
        return new ModelAndView("empform","command", new Employees());
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employees") Employees employee){

        if (!employee.getEmail().matches("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$"))
            return showform();

        if(employee.getId()>0) {
            //update
            System.out.println("Update employee nr: "+getEmployeesById(employee.getId()));
            getEmployeesById(employee.getId()).setLastName(employee.getLastName());
            getEmployeesById(employee.getId()).setSalary(employee.getSalary());
            getEmployeesById(employee.getId()).setFirstName(employee.getFirstName());
        }
         else {
            System.out.println(employee.getFirstName() + " " + employee.getSalary() + " " + employee.getLastName());
            System.out.println("New emp");
            employee.setId(employeesList.size() + 1);
            employeesList.add(employee);
        }

        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/delete", method=RequestMethod.POST)
    public ModelAndView delete(@RequestParam String id){
        employeesList.remove(getEmployeesById(Integer.parseInt(id)));

        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public ModelAndView edit(@RequestParam String id){
        Employees employees = getEmployeesById(Integer.parseInt(id));
        return new ModelAndView("empform","command", employees);
    }

    @RequestMapping(value="/test", method=RequestMethod.POST)
    public ModelAndView test(){
        System.out.println("Test");
        return new ModelAndView("redirect:/viewemp");
    }

    @RequestMapping(value="/start", method=RequestMethod.POST)
    public ModelAndView start(){
        System.out.println("Back to Home Page");
        return new ModelAndView("redirect:/");
    }

    @RequestMapping("/viewemp")
    public ModelAndView viewemp(){
        return new ModelAndView("viewemp","list", employeesList);
    }

    private Employees getEmployeesById(@RequestParam int id) {
        return employeesList.stream().filter(f -> f.getId() == id).findFirst().get();
    }

    private Phones getPhoneById(@RequestParam int id) {
        return phonesList.stream().filter(f -> f.getId() == id).findFirst().get();
    }

    private Cars getCarById(@RequestParam int id) {
        return carsList.stream().filter(f -> f.getId() == id).findFirst().get();
    }

    private Printer getPrinterById(@RequestParam int id) {
        return printerList.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}
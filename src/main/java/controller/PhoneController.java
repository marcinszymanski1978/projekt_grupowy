package controller;

import hibernate.Employees;
import hibernate.HibernateDao;
import hibernate.Phones;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PhoneController {

    private List<Phones> phonesList = new ArrayList<>();
    private HibernateDao phoneDao;
    private List<Employees> list;


    public PhoneController() {
        phoneDao = new HibernateDao();
        list = phoneDao.getEmployees();
    }

    @RequestMapping("/phoneform")
    public ModelAndView showform(){
        return new ModelAndView("phoneform","command", new Phones());
    }

    @RequestMapping(value="/savePhone", method = RequestMethod.POST )
    public ModelAndView savePhone(@ModelAttribute("phones") Phones phones){

            phones.setId(phonesList.size()+1);
            phones.setEmployees(getEmployeesById(phones.employees.getId()));
            phoneDao.saveHibernateEntity(phones);

        return new ModelAndView("redirect:");
    }
    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}

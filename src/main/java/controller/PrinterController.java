package controller;

import hibernate.Employees;
import hibernate.HibernateDao;
import hibernate.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PrinterController {

    private HibernateDao printerDao;
    private List<Employees> list;

    public PrinterController() {
        printerDao = new HibernateDao();
        list = printerDao.getEmployees();
    }

    @RequestMapping("/printerform")
    public ModelAndView showform(Model model){

        model.addAttribute("list", list);

        return new ModelAndView("printerform","command", new Printer());
    }

    @RequestMapping(value="/savePrinter", method = RequestMethod.POST )
    public ModelAndView savePrinter(@ModelAttribute("printer") Printer printer){

        printer.setEmployees(getEmployeesById(printer.employees.getId()));
        printerDao.saveHibernateEntity(printer);

        return new ModelAndView("redirect:");
    }
    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}

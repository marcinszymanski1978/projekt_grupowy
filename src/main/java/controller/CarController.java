package controller;

import hibernate.Cars;
import hibernate.Employees;
import hibernate.HibernateDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private List<Cars> carList = new ArrayList<>();
    private HibernateDao carDao;
    Cars cars;
    Employees employees;
    List<Employees> list;


    public CarController() {
        carDao = new HibernateDao();
        list = carDao.getEmployees();
    }

    @RequestMapping("/carform")
    public ModelAndView showform(){
        return new ModelAndView("carform","command", new Cars());
    }

    @RequestMapping(value="/saveCar", method = RequestMethod.POST )
    public ModelAndView saveCar(@ModelAttribute("car") Cars cars){

        cars.setId(carList.size()+1);
        cars.setEmployees(getEmployeesById(cars.employees.getId()));
        carDao.saveHibernateEntity(cars);

        return new ModelAndView("redirect:");
    }
    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}

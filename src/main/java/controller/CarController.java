package controller;

import hibernate.Cars;
import hibernate.Employees;
import hibernate.HibernateDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private HibernateDao carDao;
    private List<Employees> list = new ArrayList<>();
    private List<Cars> carList = new ArrayList<>();

    public CarController() {
        carDao = new HibernateDao();
    }

    @RequestMapping("/carform")
    public ModelAndView showform(Model model){
        list.clear();
        list = carDao.getEmployees();
        model.addAttribute("list", list);

        return new ModelAndView("carform","command", new Cars());
    }

    @RequestMapping(value="/saveCar", method = RequestMethod.POST )
    public ModelAndView saveCar(@ModelAttribute("car") Cars cars){

        if(cars.getId()!=null){
            carDao.updateHibernateEntity(cars);}
//    update
        else {
//            add
        cars.setEmployees(getEmployeesById(cars.employees.getId()));
        carDao.saveHibernateEntity(cars);
        }

        return new ModelAndView("redirect:");
    }

    @RequestMapping(value="/deleteCar", method=RequestMethod.POST)
    public ModelAndView delete(@RequestParam String id){
        carDao.deleteHibernateEntity(getCarsById(Integer.parseInt(id)));
        return new ModelAndView("redirect:");
    }

    @RequestMapping(value="/editCar", method=RequestMethod.POST)
    public ModelAndView edit(@RequestParam String id){

        Cars carToUpdate = getCarsById(Integer.parseInt(id));
        return new ModelAndView("carform","command", carToUpdate);
    }

    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }

    private Cars getCarsById(@RequestParam int id) {
        carList.clear();
        carList = carDao.getCars();

        return carList.stream().filter(f -> f.getId() == id).findFirst().get();
    }
}

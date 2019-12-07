package controller;

import hibernate.Employees;
import hibernate.HibernateDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.AvatarService;
import model.FileGetter;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ImageController {

    private HibernateDao imageDao;
    private List<Employees> list = new ArrayList<>();

    public ImageController() {
        imageDao = new HibernateDao();
    }
    @RequestMapping("/addImage")
    public ModelAndView addImg(Model model){
        list.clear();
        list = imageDao.getEmployees();
        model.addAttribute("list", list);
        return new ModelAndView("addImage","command", new FileGetter() );
    }

    @RequestMapping(value="/saveImage", method = RequestMethod.POST )
    public ModelAndView saveImage(@ModelAttribute ("FileGetter") FileGetter fileGetter){

        AvatarService avatarService = new AvatarService();
        Employees employees = getEmployeesById(fileGetter.getId());
        avatarService.addImageToDatabase(employees, fileGetter.getFile());

        return new ModelAndView("redirect:");
    }

    private Employees getEmployeesById(@RequestParam int id) {
        return list.stream().filter(f -> f.getId() == id).findFirst().get();
    }


}

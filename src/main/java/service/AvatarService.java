
package service;

import hibernate.Avatar;
import hibernate.Employees;
import hibernate.HibernateDao;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

@Service
public class AvatarService {

    public void addImageToDatabase(Employees employees, File file){

        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        Avatar avatar = new Avatar();
        avatar.setEmployees(employees);
        avatar.setImage(bFile);

        HibernateDao hibernateDao = new HibernateDao();
        hibernateDao.saveHibernateEntity(avatar);
    }

}


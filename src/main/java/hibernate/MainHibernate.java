package hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@EXTRA
//Jeżeli ktoś doda do pracownika możliwość wczytywania zdjęcia oraz
//        zostanie ono zapisane do bazy danych i wyświetlone po otworzeniu formularza*
//        Grupa 1
//
//        Hibernate:
//        PhoneDao oraz EmployeeDao, należy zrobić abstrakcje i uwspólnić kod
//        jeśli nie ma to dodać obsługę edycji, zapisu oraz usunięcia wpisu z bazdy danych
//        Dodanie tabieli drukarki. I wpięcie adnotacji @ManyToMany.
//        Czyli wyciągam pracownika i do niego podlegają na przykład 3 drukarki i ma mi wyświetlić te 3 drukarki oraz
//        wyciągam drukarkę i zwraca mi przypisanych do nich drukarek.
//        Po wykonaniu akcji (edit, add, delete) wysłanie maila na adres przypisany do pracownika z opisem wykonanych zmian.
//        Tabelki mają być usuwane i tworzone na nowo:
//        - albo przy każdym starcie aplikacji
//        - albo dwa buildy, w którym w jednym stawiamy bazę a drugim odpalamy aplikacje
//        Dane do tabelek mają być wczytywane z klasy.

public class MainHibernate {
    public static void main(String[] args) {
        HibernateDao employeeDao = new HibernateDao();
        Employees employee = new Employees("Test", "Test", "Test", "Test", 1000, 18 , new Date(), 1);
        employeeDao.saveHibernateEntity(employee);
        List<Employees> employeesList = employeeDao.getEmployees();

        Employees employeeToUpdate = employeesList.get(0);
        employeeToUpdate.setSalary(1111);
        employeeDao.updateHibernateEntity(employeeToUpdate);

        employeesList.forEach(System.out::println);

        HibernateDao phoneDao = new HibernateDao();
        Phones phones = new Phones("Sony", "Xperia 10", employee);
        phoneDao.saveHibernateEntity(phones);
        Set<Phones> phonesList = new HashSet<>();
        phonesList.add(phones);
        employee.setPhones(phonesList);
        employeeDao.updateHibernateEntity(employee);

        HibernateDao carsDao = new HibernateDao();
        Cars cars = new Cars("Audi","Q7",employee );
        carsDao.saveHibernateEntity(cars);
        Set<Cars> carsList = new HashSet<>();
        carsList.add(cars);
        employee.setCars(carsList);
        employeeDao.updateHibernateEntity(employee);

        HibernateDao printerDao = new HibernateDao();
        Printer printer = new Printer("Xerox",true,"Connectis",employee);
        printerDao.saveHibernateEntity(printer);
        Set<Printer> printerList = new HashSet<>();
        printerList.add(printer);
        employee.setPrinters(printerList);
        employeeDao.updateHibernateEntity(employee);



    }
}

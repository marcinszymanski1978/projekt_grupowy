package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.ImageType;

import java.util.List;

public class HibernateDao implements HibernateEntity {

    public void saveHibernateEntity(HibernateEntity hibernateEntity) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(hibernateEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }



    public void updateHibernateEntity(HibernateEntity hibernateEntity) {
        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(hibernateEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteHibernateEntity(HibernateEntity hibernateEntity) {


        Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(hibernateEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public List<Employees> getEmployees() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Employees", Employees.class).list();
        }
    }

    public List<Phones> getPhones() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Phones", Phones.class).list();
        }
    }

    public Employees getEmployee(int Id){
        try (Session session = HibernateConfig.getSessionFactory().openSession()){
            List<Employees> list =  session.createQuery("from Empolyees", Employees.class).list();
            return list.stream().filter(f->f.getId()==Id).findFirst().get();

        }
    }


    public List<Cars> getCars() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Cars", Cars.class).list();

        }
    }

    public List<Printer> getPrinter() {
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            return session.createQuery("from Printer", Printer.class).list();

        }
    }


}

package hibernateassignment2;

import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeManagement {

    Session session;

    public void createEmployee(Employee newEmployee) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.persist(newEmployee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
    }

    public ArrayList<Employee> listEmployee() {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            String listEmp = "from Employee";
            Query query = session.createQuery(listEmp);

            return (ArrayList<Employee>) query.list();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        return null;
    }

    public ArrayList<Employee> listByName(String inputName) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            String listEmp = "from Employee as employee where employee.emName like :parameterName";

            Query query = session.createQuery(listEmp);

            query.setParameter("parameterName", inputName);

            return (ArrayList<Employee>) query.list();

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        return null;

    }

    public ArrayList<Employee> listByAge(String inputAge) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            String listEmp = "from Employee as employee where employee.emAge = :parameterAge";
            Query query = session.createQuery(listEmp);
            query.setParameter("parameterAge", Integer.parseInt(inputAge));
            return (ArrayList<Employee>) query.list();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        return null;
    }

    public ArrayList<Employee> listByAddress(String inputAddress) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            String listEmp = "from Employee as employee where employee.emAddress like :parameterAddress";
            Query query = session.createQuery(listEmp);
            query.setParameter("parameterAddress", inputAddress);
            return (ArrayList<Employee>) query.list();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        return null;
    }

    public ArrayList<Employee> listBySalary(String inputSalary) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            String listEmp = "from Employee as employee where employee.emSalary = :salary";
            Query query = session.createQuery(listEmp);
            query.setParameter("salary", Float.parseFloat(inputSalary));
            return (ArrayList<Employee>) query.list();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }

        return null;
    }

    public void deleteByID(int inputDelete) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        Employee employeeDel;

        try {
            tx = session.beginTransaction();
            employeeDel = (Employee) session.get(Employee.class, inputDelete);
            session.delete(employeeDel);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
    }

    public Employee getByID(int inputUpdate) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;
        Employee employeeGet = null;

        try {
            tx = session.beginTransaction();

            employeeGet = (Employee) session.get(Employee.class, inputUpdate);

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
        return employeeGet;
    }

    public void updateEmployee(Employee newEmployee) {

        session = HibernateUtil.createSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            int oldEm = newEmployee.getID();

            Employee oldEmployee = (Employee) session.get(Employee.class, oldEm);
            oldEmployee.setAddress(newEmployee.getAddress());
            oldEmployee.setName(newEmployee.getName());
            oldEmployee.setAge(newEmployee.getAge());
            oldEmployee.setSalary(newEmployee.getSalary());

            session.update(oldEmployee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            System.out.println(e);
        } finally {
            HibernateUtil.close();
        }
    }
}

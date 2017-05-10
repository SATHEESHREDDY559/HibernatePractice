package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee emp= new Employee(111, "satheesh", "satheesh@gmail.com", 5000);
		Employee emp1= new Employee(112, "satheesh1", "satheesh1@gmail.com", 6000);
		Employee emp2= new Employee(113, "satheesh2", "satheesh2@gmail.com", 7000);
		Employee emp3= new Employee(114, "satheesh3", "satheesh3@gmail.com", 8000);
		session.save(emp3);
		session.save(emp2);
		session.save(emp1);
		session.save(emp);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
System.out.println("inserted");
	}

}

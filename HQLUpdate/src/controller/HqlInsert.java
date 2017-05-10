package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BeanClass;

public class HqlInsert {
public static void main(String srgs[]){
	SessionFactory sf= new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
	Session ses=sf.openSession();
	Transaction transaction=ses.beginTransaction();
	BeanClass beanClass=new BeanClass(333, "xyz", "xyz@gmail.com", "ca");
	ses.save(beanClass);
	transaction.commit();
	ses.close();
	sf.close();
	
	
}
}

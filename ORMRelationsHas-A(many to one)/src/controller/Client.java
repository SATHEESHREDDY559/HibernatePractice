package controller;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movie;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Actor a= new Actor();
		a.setId(111);
		a.setName("satheesh");
		Movie m= new Movie();
		m.setMid(12);
		m.setMname("One");
		m.setActor(a);
		Movie m1= new Movie();
		m1.setMid(13);
		m1.setMname("Athadu");
		m1.setActor(a);		
		session.save(a);
		session.save(m1);		
		session.save(m);		
		transaction.commit();
		System.out.println("inserted");
		session.close();
		sessionFactory.close();
		
		
		
	}

}

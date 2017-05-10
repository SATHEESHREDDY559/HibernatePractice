package controller;

import java.util.HashSet;
import java.util.Set;

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
		
		Movie m= new Movie();
		m.setMid(12);
		m.setMname("One");
		Movie m1= new Movie();
		m1.setMid(13);
		m1.setMname("Athadu");
		Set<Movie> set=new HashSet<Movie>();
		set.add(m);
		set.add(m1);
		Actor a= new Actor();
		a.setId(111);
		a.setName("satheesh");
		a.setMovies(set);
		/*session.save(m);
		session.save(m1);*/
		//use cascade in actor mapping file
		session.save(a);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
		
		
	}

}

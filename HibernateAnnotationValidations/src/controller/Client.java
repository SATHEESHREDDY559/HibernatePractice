package controller;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
	Student st= new Student();
	st.setId(111);
	st.setName("satheesh");
	st.setEmail("satheesh@gmail.com");
	st.setAddress("usa");
	session.save(st);
		transaction.commit();
		System.out.println("inserted");
		session.close();
		sessionFactory.close();
		
		
		
	}

}

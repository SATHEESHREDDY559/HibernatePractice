package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		Student s= new Student();
		s.setSid(222);
		s.setSname("satheesh");
		s.setSemail("satheesh@gmail.com");
				int pk=(Integer)ses.save(s);
				System.out.println("inserted"+pk);
				tx.commit();
				sf.close();
				ses.close();
				
				

	}

}

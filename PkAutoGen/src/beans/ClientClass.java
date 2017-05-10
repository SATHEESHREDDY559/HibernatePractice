package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx= ses.beginTransaction();
		BookTicket bt= new BookTicket();
		//bt.setSno(123);
		bt.setMname("one");
		bt.setMtime(11);
		int pk= (int) ses.save(bt);
		tx.commit();
		sf.close();
		ses.close();
		System.out.println("inserted success"+pk);
	}

}

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import beans.OldStudent;

public class DataDump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session ses= sf.openSession();
		Transaction tx=ses.beginTransaction();
		String hql="insert into NewStudent(sid,sname,semail,saddress) select s.sid,s.sname,s.semail,s.saddress from OldStudent s";
		Query qry=ses.createQuery(hql);
		int i=qry.executeUpdate();
		System.out.println("rows affected"+i);
		
		tx.commit();
		ses.close();
		sf.close();

	}

}

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class Test {
public static void main(String arg[]){
	
	
	SessionFactory sf= new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
	Session ses= sf.openSession();
	Transaction tx=ses.beginTransaction();
	OldStudent os=new OldStudent(111, "satheesh", "satheesh@gmail.com", "nj");
	OldStudent os1=new OldStudent(112, "abc", "abc@gmail.com", "nj");
	OldStudent os2=new OldStudent(113, "xyz", "xyz@gmail.com", "nj");
	ses.save(os);
	ses.save(os1);
	ses.save(os2);
	tx.commit();
	ses.close();
	sf.close();
}
	
	
	
}

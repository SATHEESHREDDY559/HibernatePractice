package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.StudentBean;
import beans.StudentBean;
public class Test {
public static void main(String arg[]){
	
	
	
	// Student obj state is transient
	Configuration config= new Configuration();
	config=config.configure("resources/mysql.cfg.xml");
	SessionFactory sf= config.buildSessionFactory();
	Session ss=sf.openSession();
	StudentBean s= new StudentBean();
	s.setId(111);
	s.setSname("Satheesh");
	s.setSmarks(85);
	ss.save(s);//persistant
	ss.beginTransaction().commit();//store obj in db
	ss.evict(s);//remove obj persistant
	System.out.println("inserted");
	
	
}
}

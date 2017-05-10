package beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Object obj=ses.get(Student.class,111);
		Student st=(Student)obj;
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getSemail());
		ses.close();
		sf.close();
		System.out.println("selected");
	
	}

}

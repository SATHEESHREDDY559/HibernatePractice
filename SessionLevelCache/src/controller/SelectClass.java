package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
		cfg=cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Object obj=ses.get(Student.class,111);
		Student st=(Student)obj;
		System.out.println("frist query");
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getSemail());
		/*Session ses2=sf.openSession();*/
		System.out.println("second query");
		Object obj2=ses.get(Student.class,111);
		Student st2=(Student)obj;
		System.out.println(st2.getSid());
		System.out.println(st2.getSname());
		System.out.println(st2.getSemail());
		ses.close();
		sf.close();
		System.out.println("selected");
	
	}

}

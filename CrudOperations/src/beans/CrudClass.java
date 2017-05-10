package beans;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg= cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		//ses.get(Student.class, 111);
		Student s=new Student();
		s.setSid(111);
		s.setSname("satheesh");
		s.setSemail("satheeshreddy559@gmail.com");
		ses.merge(s);
		System.out.println("updated");
		//ses.update(s);
		//int i=(int) ses.save(s);
		tx.commit();
		Object obj=ses.get(Student.class,111);
		Student st=(Student)obj;
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		System.out.println(st.getSemail());
		ses.close();
		sf.close();
		System.out.println("selected");
		
		
		//System.out.println("inserted"+i);
		/*Student st1=new Student();
		st1.setSid(111);
		ses.delete(st1);//deletes record
		System.out.println("deleted");
		*/
		
		

	}

}

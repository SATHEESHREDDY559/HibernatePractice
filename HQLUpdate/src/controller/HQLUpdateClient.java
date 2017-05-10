package controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BeanClass;

public class HQLUpdateClient {
	public static void main(String srgs[]){
		SessionFactory sf= new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session ses=sf.openSession();
		Transaction transaction=ses.beginTransaction();
		//String hql="update BeanClass set sid=100 where sid=111";
		String hql="update BeanClass set saddress='satheesh' where saddress='NJ'";
		Query qry=ses.createQuery(hql);
		int i=qry.executeUpdate();
		transaction.commit();
		System.out.println("updated"+i);
		ses.close();
		sf.close();
		


}

}

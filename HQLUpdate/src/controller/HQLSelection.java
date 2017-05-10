package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.BeanClass;

public class HQLSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf= new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session ses=sf.openSession();
		Transaction transaction=ses.beginTransaction();
		//String hql="update BeanClass set sid=100 where sid=111";
		/*String hql="from BeanClass  where saddress='ca'";
		Query qry=ses.createQuery(hql);
		Object obj=qry.uniqueResult();
		BeanClass bc= (BeanClass)obj;
		System.out.println(bc.getSid());
		System.out.println(bc.getSname());
		System.out.println(bc.getSemail());
		System.out.println(bc.getSaddress());*/
		/* String hql="select sid,sname from BeanClass";
		 Query qry=ses.createQuery(hql);
		 List<Object> list=qry.list();
		 for(Object obj:list){
			 Object ob[]=(Object[])obj;
			 System.out.println(ob[0]);
			 System.out.println(ob[1]);*/
		
	Query qry=ses.createQuery("from BeanClass");
	List<BeanClass> list=qry.list();
	
	for(BeanClass o:list){
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("ID: "+o.getSid());
		System.out.println("Name: "+o.getSname());
		System.out.println("Email: "+o.getSemail());
		System.out.println("Email: "+o.getSaddress());

			 
		 }
		 
		
		
		ses.close();
		sf.close();
	}

}

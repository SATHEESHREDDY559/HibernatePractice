package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectAll {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		//Criterion ct=Restrictions.eq("id", 114);
		Criterion ct=Restrictions.gt("salary", 5000);
		cr.add(ct);
		//Employee emp=(Employee)cr.uniqueResult();
		//System.out.println(emp.getName());
		
		List<Employee> list=cr.list();
		for(Employee e:list){
			System.out.println(""+e.getName()+""+e.getEmail()+""+e.getSalary());
		}
}
}
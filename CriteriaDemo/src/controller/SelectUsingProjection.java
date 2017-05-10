package controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class SelectUsingProjection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		Projection p=Projections.property("name");
	
		Projection p1=Projections.property("id");
		ProjectionList pl=Projections.projectionList();
		pl.add(p1);
		pl.add(p);
		cr.setProjection(pl);
		List<Object[]> list=cr.list();
		for(Object[] e:list){
			System.out.println(""+e[0]+"    "+e[1]);
		}
}
}
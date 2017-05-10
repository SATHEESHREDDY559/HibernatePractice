package controller;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import beans.Employee;

public class AggregationUsingProj {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		/*Criteria cr=session.createCriteria(Employee.class);
		Projection p=Projections.avg("salary");
		cr.setProjection(p);
		double avg=(Double)cr.uniqueResult();
		System.out.println(avg);*/
			//max,min, sum	
		Criteria cr=session.createCriteria(Employee.class);
		Projection p=Projections.sum("salary");
		cr.setProjection(p);
		long sal=(Long)cr.uniqueResult();
		System.out.println(sal);
				
		//ProjectionList pl=Projections.projectionList();
}
}

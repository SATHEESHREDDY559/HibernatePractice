package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.AdminEmp;
import beans.HWEmp;
import beans.SEmp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=new Configuration().configure("resources/oracle.cfg.xml").buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction transaction=session.beginTransaction();
SEmp sEmp=new SEmp(111,"satheesh","satheesh@gmail.com",8000,"Java");
HWEmp hWEmp=new HWEmp(121,"raju","raju@gmail.com",9000,40);
AdminEmp adEmp=new AdminEmp(222,"sunil","sunil@gmail.com",10000,"nj");
session.save(sEmp);
session.save(hWEmp);
session.save(adEmp);
transaction.commit();
session.close();
sessionFactory.close();
System.out.println("inserted success");
	}

}

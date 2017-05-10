package test;

import org.hibernate.cfg.Configuration;

public class Test {
public static void main(String srg[]){
	Configuration cf= new Configuration();
	cf.configure("hibernate.cfg.xml");
	cf.buildSessionFactory();
	System.out.println("done");
	
	
	
}
	
}

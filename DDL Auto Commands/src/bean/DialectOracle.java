package bean;

import org.hibernate.cfg.Configuration;

public class DialectOracle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf= new Configuration();
		cf.configure("hibernate.cfg.xml");
		cf.buildSessionFactory();
		
		
		

	}

}

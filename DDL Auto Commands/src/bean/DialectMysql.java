package bean;

import org.hibernate.cfg.Configuration;

public class DialectMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cf= new Configuration();
		cf.configure("mysql.cfg.xml");
		cf.buildSessionFactory();
		
		
		

	}

}

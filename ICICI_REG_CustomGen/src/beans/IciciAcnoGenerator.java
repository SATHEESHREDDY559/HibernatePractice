package beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

public class IciciAcnoGenerator extends IdentityGenerator {
	@Override
	public Serializable generate(SharedSessionContractImplementor s, Object obj) {
	
		// TODO Auto-generated method stub
		
		//get nxt seq 
		// append to icici string
		//send to table
		
		/*SQL> create sequence jntu_sequence
		  2  start with 2000
		  3  increment by 1
		  4  nocycle
		  5  nocache;*/
		try{
		Connection con=s.connection();
		java.sql.Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select icici.nextval from dual");
		String name="ICICI";
		if (rs.next()) {
			name=name+rs.getInt(1);
			return name;
		}}
		catch(Exception e) {
			return null;

		}
		
		return null;
	}

}

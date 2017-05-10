package controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.IciciClass;

/**
 * Servlet implementation class IciciServlet
 */
@WebServlet("/create")
public class IciciServlet extends HttpServlet {
	 SessionFactory sf=null;
	private static final long serialVersionUID = 1L;
       public  void init(ServletConfig config){
    	  sf=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
    	   
       }
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IciciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		String email= request.getParameter("email");
		int phone =Integer.parseInt(request.getParameter("phone"));
		int balance= Integer.parseInt(request.getParameter("balance"));
		IciciClass ic= new IciciClass(null,name,email,phone,balance);
		Session ses=sf.openSession();
		int pk=(int) ses.save(ic);
		System.out.println("inserted   "+pk);
		Transaction tx=ses.beginTransaction();
		tx.commit();
		ses.close();
		sf.close();
		
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.StudentBean;


/**
 * Servlet implementation class GetDataServlet
 */
@WebServlet("/select")
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SessionFactory sf=null;
	
	public void init(ServletConfig config){
		sf=new Configuration().configure("resources/mysql.cfg.xml").buildSessionFactory();
	}

    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		int fr=Integer.parseInt(request.getParameter("fr"));
		int mr=Integer.parseInt(request.getParameter("mr"));
		Query qry=session.createQuery("from StudentBean");
		qry.setFirstResult(fr);
		qry.setMaxResults(mr);
		List<StudentBean>list=qry.list();
		if(list!=null)
		for(StudentBean st:list){
			response.getWriter().println("<br>");
			response.getWriter().println("Id="+st.getId()+"\tName="+st.getSname()+"\t Email"+st.getSemail()+"\t Marks"+st.getSmarks());
			
		}
		else{
			response.getWriter().print("no results");
		}
		
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

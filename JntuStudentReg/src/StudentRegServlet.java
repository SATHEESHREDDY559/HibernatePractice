

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

import beans.StudentBean;

/**
 * Servlet implementation class StudentRegServlet
 */
@WebServlet("/reg")
public class StudentRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       SessionFactory sf= null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(ServletConfig config) throws ServletException{
    	sf=new Configuration().configure("resources/hibernate.cfg.xml").buildSessionFactory();
    	
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname=request.getParameter("name");
		String semail=request.getParameter("semail");
		int smarks=Integer.parseInt(request.getParameter("marks"));
		StudentBean sb= new StudentBean();
		sb.setSname(sname);
		sb.setSemail(semail);
		sb.setSmarks(smarks);
		Session ses=sf.openSession();
		Transaction tx= ses.beginTransaction();
		int pk=(int) ses.save(sb);
		tx.commit();
		ses.close();
		response.getWriter().println("reg success  "+pk);
		
	}
	public void detroy(){
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

package Pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExServelet2
 */
@WebServlet("/ExServelet2")
public class ExServelet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try
		{
			String name=null,gen=null;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Project");
			System.out.print("Success");
		    Statement st=con.createStatement();
	        name=request.getParameter("sname");
	        gen=request.getParameter("gender");
	        System.out.print(""+name);
	        System.out.print(""+gen);
	        int rs=st.executeUpdate("insert into customers(Name)values('"+name+"')");
	        ResultSet rs1=st.executeQuery("select * from customers");
		    while(rs1.next())
		    {
		    	out.println(rs1.getString(2));
		    	out.println(rs1.getString(3));
		    }
		}
		
			 catch (Exception e)
			 {
			// TODO Auto-generated catch block
			 System.out.print(e.getMessage());
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

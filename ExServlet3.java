package Pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExServlet3
 */
@WebServlet("/ExServlet3")
public class ExServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServlet3() {
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
			String uname=null,mobile=null,name=null,faname=null,gen=null,dop=null,item=null,mailid=null,bname=null,ifsc=null,address=null,num=null,anum=null,pincode=null,amount=null,interest=null;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Project");
			Statement st=con.createStatement();
			uname=request.getParameter("uname");
			mobile=request.getParameter("mobile");
			System.out.println(""+uname);
	        ResultSet rs1=st.executeQuery("select * from Table4 where name='"+uname+"'");
	        while(rs1.next())
	        {
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<style>");
	        out.println("header{");
	        out.println("padding:25px;");
	        out.println("text-align:center;");
	        out.println("background:#8a00e6 ;");
	        out.println("color:white;");
	        out.println("font-size:25px;");
	        out.println("word-spacing:10px;");
	        out.println("}");
	        out.println("</style>");
	        out.println("<body>");
	        out.println("<header>SMART CLICK ELECTRONICS</header>");
	        out.print("Customer name:");
	        out.println("</td>");
	        out.println("<td>");
		    out.print(rs1.getString(2));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Father name:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(3));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Gender:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(4));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("EmailAddress:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(5));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Mobile number:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(6));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Account number:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(7));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Bank name:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(8));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("IFSC code:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(9));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Items purchased with quantity:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(10));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Amount of purchase:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(11));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("date of purchase:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(12));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Interest percentage:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(13));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Contact Address with pincode:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(14));
		    out.println(rs1.getString(15));
		    out.println("</td></tr>");
		   
		    }}
		catch (Exception e)
		 {
		// TODO Auto-generated catch block
		 out.print(e.getMessage());
		 System.out.println("Enter the username and mobile are vaild");
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

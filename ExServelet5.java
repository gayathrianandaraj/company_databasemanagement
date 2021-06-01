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
 * Servlet implementation class ExServelet5
 */
@WebServlet("/ExServelet5")
public class ExServelet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet5() {
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
			String id=null,mobile=null,name=null,faname=null,gen=null,dop=null,item=null,mailid=null,bname=null,ifsc=null,address=null,num=null,anum=null,pincode=null,amount=null,interest=null;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Project");
			Statement st=con.createStatement();
			id=request.getParameter("id");
			System.out.println(""+id);
	        ResultSet rs1=st.executeQuery("select * from Table6 where empid='"+id+"'");
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
	        out.println("</html>");
	        out.println("</head>");
	        out.println("</style>");
	        out.println("<body>");
	        out.println("<header>SMART CLICK ELECTRONICS");
	        out.println("<form action=admin1.html>");
	        out.println("<button>logout</button>");
	        out.println("</form>");
	        out.println("</header>");
	        out.print("Employee id");
	        out.println("</td>");
	        out.println("<td>");
		    out.print(rs1.getString(2));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Name:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(3));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Fathername");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(4));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Mothername");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(5));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Gender");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(6));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Date of birth:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(7));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Age:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(8));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Marriage status");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(9));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Email address");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(10));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Mobile number:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(12));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Eduaction qualification:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(13));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Years of experience:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(14));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Designation:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(15));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Adharnumber");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(16));
		    out.println("</td></tr>");
		    out.println("<tr><td>");
		    out.print("Account number");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(17));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Bank name");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(18));
		    out.println("</td></tr>");
		    out.println("<br>");
		    out.println("<tr><td>");
		    out.print("Address with pincode:");
		    out.println("</td>");
	        out.println("<td>");
		    out.println(rs1.getString(19));
		    out.println(rs1.getString(20));
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

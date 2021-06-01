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
 * Servlet implementation class ExServelet
 */
@WebServlet("/ExServelet")
public class ExServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet() {
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
			String name=null,faname=null,gen=null,dop=null,item=null,mailid=null,bname=null,ifsc=null,address=null,num=null,anum=null,pincode=null,amount=null,interest=null;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Project");
			Statement st=con.createStatement();
			name=request.getParameter("surname");
			faname=request.getParameter("fname");
			gen=request.getParameter("gender");
			mailid=request.getParameter("mail");
			num=request.getParameter("mobile");
			anum=request.getParameter("account");
			bname=request.getParameter("bankname");
			ifsc=request.getParameter("ifsccode");
			item=request.getParameter("item");
			amount=request.getParameter("purchase"); 
			dop=request.getParameter("dat");
			interest=request.getParameter("percent");
			address=request.getParameter("add");
			pincode=request.getParameter("pin");
		    System.out.print(""+name);
	        int rs=st.executeUpdate("insert into Table4(name,fathername,gender,email,mobileno,account,bank,ifsc,items,amount,dop,interest,address,pincode)values('"+name+"','"+faname+"','"+gen+"','"+mailid+"','"+num+"','"+anum+"','"+bname+"','"+ifsc+"','"+amount+"','"+item+"','"+dop+"','"+interest+"','"+address+"','"+pincode+"')");
	        ResultSet rs1=st.executeQuery("select * from Table4");
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<style>");
		    out.println("<body style=background-color:#f2f2f2;font-family=Arial>");
		    out.println("<h2>YOUR DETAILS HAVE BEEN UPDATED</h2>");
		    out.println("<center>");
            out.println("Name:"+name);
            out.println("<br>");
            out.println("<br>");
            out.println("Fathername:"+faname);
            out.println("<br>");
            out.println("<br>");
            out.println("Gender:"+gen);
            out.println("<br>");
            out.println("<br>");
            out.println("Email:"+mailid);
            out.println("<br>");
            out.println("<br>");
            out.println("Mobile number:"+num);
            out.println("<br>");
            out.println("<br>");
            out.println("Account number:"+anum);
            out.println("<br>");
            out.println("<br>");
            out.println("Bank name:"+bname);
            out.println("<br>");
            out.println("<br>");
            out.println("IFSC code:"+ifsc);
            out.println("<br>");
            out.println("<br>");
            out.println("Purchased items with quantity:"+item);
            out.println("<br>");
            out.println("<br>");
            out.println("Amount of purchase:"+amount);
            out.println("<br>");
            out.println("<br>");
            out.println("Date of purchase:"+dop);
            out.println("<br>");
            out.println("<br>");
            out.println("Interest percent:"+interest);
            out.println("<br>");
            out.println("<br>");
            out.println("Contact address:"+address);
            out.println("<br>");
            out.println("<br>");
            out.println("Pincode:"+pincode);
            out.println("<body>");
            out.println("<head>");
            out.println("<html>");
           }
			 catch (Exception e)
			 {
			// TODO Auto-generated catch block
			 out.print(e.getMessage());
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

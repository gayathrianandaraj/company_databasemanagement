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
 * Servlet implementation class ExServelet4
 */
@WebServlet("/ExServelet4")
public class ExServelet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet4() {
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
			String id=null,name=null,adhar=null,faname=null,mname=null,gen=null,dob=null,age=null,marriage=null,mailid=null,pass=null,educate=null,years=null,designation=null,bname=null,address=null,num=null,anum=null,pincode=null;
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con=DriverManager.getConnection("jdbc:odbc:Project");
			Statement st=con.createStatement();
			id=request.getParameter("id");
			name=request.getParameter("sname");
			faname=request.getParameter("fname");
			mname=request.getParameter("mname");
			gen=request.getParameter("gender");
			dob=request.getParameter("dat");
			age=request.getParameter("age");
			marriage=request.getParameter("marriage");
			mailid=request.getParameter("mail");
			pass=request.getParameter("pass");
			num=request.getParameter("mobile");
			educate=request.getParameter("edu");
			years=request.getParameter("years");
			designation=request.getParameter("des");
			anum=request.getParameter("acc");
			adhar=request.getParameter("adh");
			bname=request.getParameter("bankname");
			address=request.getParameter("add");
			pincode=request.getParameter("pin");
		    System.out.print(""+name);
	        int rs=st.executeUpdate("insert into Table6(empid,name,fathername,mothername, gender,dob,age,marital,email,password,mobile,education,years,designation,adhar,account,bankname,address,pincode)values('"+id+"','"+name+"','"+faname+"','"+mname+"','"+gen+"','"+dob+"','"+age+"','"+marriage+"','"+mailid+"','"+pass+"','"+num+"','"+educate+"','"+years+"','"+designation+"','"+adhar+"','"+anum+"','"+bname+"','"+address+"','"+pincode+"')");
		    out.println("<html>");
		    out.println("<head>");
		    out.println("<body style=background-color:#f2f2f2;font-family=Arial>");
		    out.println("<h2>YOUR DETAILS HAVE BEEN UPDATED</h2>");
		    out.println("<center>");
		    out.println("Employee id:"+id);
            out.println("<br>");
            out.println("<br>");
            out.println("Name:"+name);
            out.println("<br>");
            out.println("<br>");
            out.println("Fathername:"+faname);
            out.println("<br>");
            out.println("<br>");
            out.println("Gender:"+gen);
            out.println("<br>");
            out.println("<br>");
            out.println("Date of birth:"+dob);
            out.println("<br>");
            out.println("<br>");
            out.println("Age:"+age);
            out.println("<br>");
            out.println("<br>");
            out.println("Marrital Status:"+marriage);
            out.println("<br>");
            out.println("<br>");
            out.println("Email:"+mailid);
            out.println("<br>");
            out.println("<br>");
            out.println("Mobile number:"+num);
            out.println("<br>");
            out.println("<br>");
            out.println("Education Qualification:"+educate);
            out.println("<br>");
            out.println("<br>");
            out.println("Years of eduaction:"+years);
            out.println("<br>");
            out.println("<br>");
            out.println("Designation:"+designation);
            out.println("<br>");
            out.println("<br>");
            out.println("Account number:"+anum);
            out.println("<br>");
            out.println("<br>");
            out.println("Bank name:"+bname);
            out.println("<br>");
            out.println("<br>");
            out.println("Adhar number:"+adhar);
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

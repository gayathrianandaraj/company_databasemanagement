package Pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExServelet8
 */
@WebServlet("/ExServelet8")
public class ExServelet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet8() {
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
		String name=null,quantity=null;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Project");
		Statement st=con.createStatement();
		name=request.getParameter("item");
		quantity=request.getParameter("quan");
		System.out.println(""+quantity);
		int rs=st.executeUpdate("Update Table9 set quantity='"+quantity+"' where name='"+name+"'");
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
		out.println("<h1>The stock details have been updated</h1>");
		}
		catch (Exception e)
		 {
		// TODO Auto-generated catch block
		 out.print(e.getMessage());
	}}

	/**}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

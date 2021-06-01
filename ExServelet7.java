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
 * Servlet implementation class ExServelet7
 */
@WebServlet("/ExServelet7")
public class ExServelet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExServelet7() {
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
		String name=null,brand=null,quantity=null,price=null;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con=DriverManager.getConnection("jdbc:odbc:Project");
		Statement st=con.createStatement();
		name=request.getParameter("item");
		brand=request.getParameter("brand");
		quantity=request.getParameter("quan");
		price=request.getParameter("price");
		int rs=st.executeUpdate("insert into Table9(name,brandname,quantity,price)values('"+name+"','"+brand+"','"+quantity+"','"+price+"')");
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
		out.println("<h1>Stock details have been stored</h1>");
		}
		catch (Exception e)
		 {
		// TODO Auto-generated catch block
		 out.print(e.getMessage());
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

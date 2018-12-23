package gr.hua.dit.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class testDB
 */
@WebServlet("/testDB")
public class testDB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// setup connection variables
        String jdbcUrl = "jdbc:mysql://sql7.freesqldatabase.com/sql7270490?useSSL=false";
        String user = "sql7270490";
        String pass = "ny9ZSDfJKK";
        String driver= "com.mysql.jdbc.Driver";
        
        // get connection to DB
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
        	System.out.println("error");
        }
        
        try {
                PrintWriter out = response.getWriter();
                out.println("Connecting to db: " + jdbcUrl);
                
                Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
                out.println("Connection Success!");
                con.close();
        }
        catch (Exception e) {
                e.printStackTrace();
                System.out.println("error");
                throw new ServletException(e);
        }
	}

}

// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

// Extend HttpServlet class
public class server1 extends HttpServlet {
 
   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello World";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
 // try
//{
//Class.forName("com.mysql.jdbc.Driver");
//Connection conn = null;
//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testtable","root", "");
//System.out.print("Database is connected !");
//conn.close();
//}
//catch(Exception e)
//{

//      out.println("<h1>" + message + "</h1>");
//}
}

   public void destroy() {
      // do nothing.
   }
}
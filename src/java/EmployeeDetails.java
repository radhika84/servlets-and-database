

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/EmployeeDetails"})
public class EmployeeDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
           
        } finally {
            out.close();
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String eid=request.getParameter("num");

        try{
            Properties p = new Properties();
            p.load(this.getClass().getResourceAsStream("config.properties"));
            //out.println(p.get("dbpassword"));
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database?user=root&password=root");
            PreparedStatement ps=con.prepareStatement("select * from employees where emp_id=?");
            ps.setString(1, eid);
            out.print("<table width=25% border=1>");
            out.print("<center><h1>Result;</h1></center>");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            while(rs.next()){
                out.print("<tr>");
                out.print("<td>"+rsmd.getColumnName(1)+"</td>");
                out.print("<td>"+rs.getString(1)+"</td></tr>");
                out.print("<td>"+rsmd.getColumnName(2)+"</td>");
                out.print("<td>"+rs.getString(2)+"</td></tr>");
                 out.print("<td>"+rsmd.getColumnName(3)+"</td>");
                out.print("<td>"+rs.getString(3)+"</td></tr>");
               
                
            }
            out.printf("</table>");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            out.close();
        }
    }
    

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}

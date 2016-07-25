

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/UpdateEmployeeDetails"})
public class UpdateEmployeeDetails extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateEmployeeDetails</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateEmployeeDetails at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
          String eid = request.getParameter("empid");
          String ename = request.getParameter("empname");
          String esalary=request.getParameter("empsalary");
          int empid=Integer.parseInt(eid);
          double empsalary=Integer.parseInt(esalary);
    try {        
           
           DbSingleton sconn=DbSingleton.getsconn();
          Connection con=sconn.getCon();
           
          System.out.println("got the connection");
          
       PreparedStatement  ps =  con.prepareStatement("update database.employees set emp_id=?,emp_name=?,emp_salary=? where emp_id=?");
      

        ps.setInt(1, empid);
        ps.setString(2, ename);
        ps.setDouble(3, empsalary);
        ps.setInt(4,empid);
        
        int i = ps.executeUpdate();
        if (i > 0) {
            
            out.println("<h1>"+"values updated succesfully"+"</h1>");
        }
           
            
    } catch (Exception se) {
        out.println("Error Occured : \n" + se.getLocalizedMessage());
        se.printStackTrace();
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
    }// </editor-fold>

}

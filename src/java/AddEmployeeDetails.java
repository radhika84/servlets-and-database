

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


@WebServlet(urlPatterns = {"/AddEmployeeDetails"})
public class AddEmployeeDetails extends HttpServlet {

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
        processRequest(request, response);
        String empid=request.getParameter("empid");
        String empname= request.getParameter("empname");
        String empsalary=request.getParameter("empsalary");
        try {
            calJdbc(empid,empname,empsalary);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.append("<html><body>Values are inserted in the database</body></html");
    }

        
        void calJdbc(String empid,String empname,String empsalary) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException
        {
            //Connection con=null;
            
            
            ResultSet rs=null;
               try{
            DbSingleton sconn=DbSingleton.getsconn();
            Connection con=sconn.getCon();  
            System.out.println("got the connection");
            
         PreparedStatement st=con.prepareStatement("insert into database.employees values(?,?,?)");
         
         st.setInt(1,Integer.parseInt(empid));
         st.setString(2, empname);
         st.setDouble(3,Double.parseDouble(empsalary));
         st.execute();
               } 
               catch(SQLException e){
                   e.printStackTrace();
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


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbSingleton {

     private static final DbSingleton S_CONN = new DbSingleton();
    private Connection con;
    private static String db_url;

    private static String db_user;
    private static String db_password;

    private static String db_driver;
    
    private DbSingleton()   {
       
       // Properties p = new Properties();
//    p.load(this.getClass().getResourceAsStream("config.properties"));

          //db_password= (String) p.get("dbpassword");
        db_url = "jdbc:mysql://127.0.0.1:3306";
      // db_user =(String) p.get("dbuser");
        db_user="root";
        db_password = "root";
        db_driver = "com.mysql.jdbc.Driver";
        //db_driver=p.getProperty("dbdriver");

        try {
            Class.forName(db_driver);
            con = DriverManager.getConnection(db_url, db_user, db_password);
            System.out.println("got the connection");

        } catch (SQLException ex) {
            Logger.getLogger(DbSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex.getMessage());
        }

}
    public Connection getCon(){
        return con;
    }
    public void setCon(Connection con){
        this.con=con;
    }
    public static DbSingleton getsconn(){
        return S_CONN;
    }
    
}

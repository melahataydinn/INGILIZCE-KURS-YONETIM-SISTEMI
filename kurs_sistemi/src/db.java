import java.sql.*;
import javax.swing.JOptionPane;
public class db {
    //Connection con=null;
    public static Connection connect_db(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\ASUS\\Documents\\NetBeansProjects\\kurs_sistemi\\kurs_sistemidb.sqlite");
            return conn;
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return null;
        }
    }

}

package MyPack;
import java.sql.*;

public class cp {
    public static Connection con;

    public static Connection createCon() {
        
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path="D:\\mydb.accdb";
            String url="jdbc:ucanaccess://"+path;
            con=DriverManager.getConnection(url);
            System.out.println("Connection Created");
        }catch(Exception e){
            System.out.println("Exception Occure: "+e);
        }
        return con;

    }    
    
}

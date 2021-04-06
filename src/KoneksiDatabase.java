import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase{
    Connection koneksi;
    public KoneksiDatabase(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Looking for Connection...");
        }catch(ClassNotFoundException cnf){
            System.out.println("Connection not found" + cnf.getLocalizedMessage());
        }
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/movie rental", "root", "");
        }catch(SQLException e2){
            e2.printStackTrace();
        }
    }
    public Connection getConnection(){
        return koneksi;
    }
}
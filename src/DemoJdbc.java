import java.sql.*;
import java.util.Collection;

public class DemoJdbc {

    /*
    Import package
    Load and register
    Create Connection
    Create Statement
    Execute Statement
    Process the result
    Close
     */

    public static void main(String[] args) throws Exception {
        String url = "jdbc:postgresql://localhost:8080/demo";
        String uname = "postgres";
        String pass = "0000";
        String sql = "select * from students";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        System.out.println("your name is: " + rs.getString("sname"));
        con.close();
        System.out.println("Collection is closed");


    }

}


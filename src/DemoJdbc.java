import java.sql.*;

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
        String uname= "postgres";
        String pass= "0000";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");
    }

}


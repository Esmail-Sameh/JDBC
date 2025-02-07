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
        String uname = "postgres";
        String pass = "0000";
        String sql = "select * from students";
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection established");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
//        rs.next();
//        System.out.println("your name is: " + rs.getString("sname"));
        while (rs.next()){
            System.out.print("id is: "+ rs.getString("sid") + " , ");
            System.out.print("Name is: " + rs.getString("sname") + " , ");
            System.out.println("Age is: " + rs.getString("sage") + " years old \n-------------------------------");
        }
        con.close();
        System.out.println("Collection is closed");



    }

}


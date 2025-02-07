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
//
//        String url = "jdbc:postgresql://localhost:8080/demo";
//        String uname = "postgres";
//        String pass = "0000";
//        String sql = "select * from students";
//        Connection con = DriverManager.getConnection(url, uname, pass);
//        System.out.println("Connection established");
//        Statement stmt = con.createStatement();
//        ResultSet rs = stmt.executeQuery(sql);
////        rs.next();
////        System.out.println("your name is: " + rs.getString("sname"));
//        while (rs.next()){
//            System.out.print("id is: "+ rs.getString("sid") + " , ");
//            System.out.print("Name is: " + rs.getString("sname") + " , ");
//            System.out.println("Age is: " + rs.getString("sage") + " years old \n-------------------------------");
//        }
//        con.close();
//        System.out.println("Collection is closed");

        String url = "jdbc:postgresql://localhost:8080/demo";
        String uname = "postgres";
        String pass = "0000";

        String sid = "6";
        String sname = "tttt";
        String sage = "78";

        String sql1 = "insert into students values (?, ?, ?)";
        String sql2 = "UPDATE students SET sid = ?, sname =?, sage =? WHERE sid = '20'";

        Connection con = DriverManager.getConnection(url, uname, pass);
        PreparedStatement stmt = con.prepareStatement(sql2);
        stmt.setString(1, sid);
        stmt.setString(2, sname);
        stmt.setString(3, sage);
        stmt.execute();
        con.close();



    }

}


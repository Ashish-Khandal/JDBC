


import java.sql.*;

public class CreateTable {
    public static void main(String args[]) {
        try {
            // load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Youtube", "root", "Sudarshan@00");
            
        //! Insert a query:
        String q = "create table Table2(T1ID int primary key auto_increment, T1Name varchar(200) not null, T1City varchar(200))";
        // Create Statement
        Statement stmt = con.createStatement();
        stmt.executeUpdate(q);
        System.out.println("Table created in databases.");
        con.close();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
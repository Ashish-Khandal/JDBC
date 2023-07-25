

import java.sql.*;
public class FirstJdbc {
    public static void main(String[] args) {
        try {
            //! Load Driver :
            Class.forName("com.mysql.cj.jdbc.Driver");
            //! Create a Connection : 
            String url = "jdbc:mysql://localhost:3306/Youtube";
            String userName = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, userName, password);

            if (con.isClosed()) {
                System.out.println("Connection is closeed...");
            } else {
                System.out.println("Connection created...");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

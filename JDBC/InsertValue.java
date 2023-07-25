

import java.sql.*;
public class InsertValue {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, username, password);


            String s = "Insert into table1(t1Name,t1City) values(?,?)";

            PreparedStatement pstmt = con.prepareStatement(s);

            pstmt.setString(1,"Alok");
            pstmt.setString(2,"Jaipur");

            pstmt.executeUpdate();

            System.out.println("Insert a value..");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

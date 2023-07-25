

import java.sql.*;
import java.io.*;
public class InsertValueWithUser2 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, username, password);


            String s = "Insert into table1(t1Name,t1City) values(?,?)";

            PreparedStatement pstmt = con.prepareStatement(s);

            
            //!  ***********************    SECOND METHOD    ****************************

            //?   Help of Buffer Reader
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter your name:-");
            String name = br.readLine();
            System.out.print("Enter your city:-");
            String city = br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);

            pstmt.executeUpdate();

            System.out.println("Insert a value..");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}



import java.sql.*;
import java.util.Scanner;
public class InsertValueWithUser1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, username, password);


            String s = "Insert into table1(t1Name,t1City) values(?,?)";

            PreparedStatement pstmt = con.prepareStatement(s);


            //!  ***********************    FIRST METHOD    ****************************
            
            //?  Help of Scanner class
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name:-");
            String name = sc.nextLine();
            System.out.print("Enter your city:-");
            String city = sc.nextLine();

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

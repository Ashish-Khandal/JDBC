

import java.sql.*;
import java.io.*;
public class InsertImage {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, username, password);


            String s = "Insert into Image(ImName) values(?)";

            PreparedStatement pstmt = con.prepareStatement(s);

            //!   Blob Store max 65kb Images.
            //?   ImName Datatype is blob in the database.

            FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Pictures\\Saved Pictures\\000.png");

            pstmt.setBinaryStream(1,fis,fis.available());
            pstmt.executeUpdate();

            System.out.println("Insert a Image..");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

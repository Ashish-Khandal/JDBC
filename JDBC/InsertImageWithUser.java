
import java.sql.*;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import java.io.*;
public class InsertImageWithUser {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";       
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url, username, password);


            String s = "Insert into Image(ImName) values(?)";

            PreparedStatement pstmt = con.prepareStatement(s);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File f = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(f);
            
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Success");
            
            System.out.println("Insert a Image..");

            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

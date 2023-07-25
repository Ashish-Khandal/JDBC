package MySqlConnecoterWithJdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class InsertImageWithChoice{
    public static void main(String[] args) {
        try {
            Connection c = ConnectionProvider.getConnection();

            String q = "Insert into Image(ImName) values(?)";
            PreparedStatement pstmt = c.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();
            jfc.showOpenDialog(null);
            File f = jfc.getSelectedFile();
            FileInputStream fis = new FileInputStream(f);
            pstmt.setBinaryStream(1, fis, fis.available());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Success");
            System.out.println("Insert a Image...");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
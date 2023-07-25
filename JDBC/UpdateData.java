import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "Sudarshan@00");

            String q = "update table1 set t1name=?, t1city=? where t1id=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter your update id :- ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Enter your update name :- ");
            String name = br.readLine();
            System.out.print("Enter your update city :- ");
            String city = br.readLine();

            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();
            System.out.println("Updated....");
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

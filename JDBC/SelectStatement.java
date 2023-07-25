import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectStatement {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube", "root", "Sudarshan@00");

            String q = "select * from table1";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(q);
            
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String city = rs.getString(3);
                System.out.println(+id+" : "+name+" : "+city);
            }
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

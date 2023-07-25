
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Demo {
    public static void main(String[] args) {
        try {
            //load driver 
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connection Stable
            String url = "jdbc:mysql://localhost:3306/Demo";
            String username = "root";
            String password = "Sudarshan@00";
            Connection con = DriverManager.getConnection(url,username,password);

            String q = "Select * from no1";

            Statement stmt = con.createStatement();
        
            ResultSet rs = stmt.executeQuery(q);
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String salary = rs.getString(3);
                System.out.println(id+":"+name+":"+salary);
            }
            System.out.println("Success...");
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}

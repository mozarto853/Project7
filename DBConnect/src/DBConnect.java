import java.sql.*;
import java.sql.Statement;

public class DBConnect {


    public static void main(String [] args){

        try {
            String host = "jdbc:mysql://localhost:3306/team10";
            String uName = "root";
            String uPass = "SQLuSe*for";
            Connection con = DriverManager.getConnection(host, uName, uPass);
            
            Statement stat = con.createStatement();
            String sql = "select * from teacher";
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()) {
                int id_col = rs.getInt("id");
                String name = rs.getString("Name");
                String job = rs.getString("Subject");

                String p = id_col + " " + name + " " + job;
                System.out.println(p);
            }
            
            
        }catch (SQLException err){
            System.out.println(err.getMessage());
        }
    }
}

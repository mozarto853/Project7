package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectToSqlDB {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

 public static Properties loadProperties() throws IOException{
     Properties prop = new Properties();
     InputStream ism = new FileInputStream("src/secret.properties.properties");
     prop.load(ism);
     ism.close();
     return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, ClassNotFoundException, SQLException {
     Properties properties = loadProperties();
     String driverClass = properties.getProperty("MYSQLJDBC.driver");
     String url = properties.getProperty("MYSQLJDBC.url");
     String userName = properties.getProperty("MYSQLJDBC.userName");
     String password = properties.getProperty("MYSQLJDBC.password");
     Class.forName(driverClass);
     connect = DriverManager.getConnection(url,userName,password);
     return connect;
    }
    public static List<Teacher> readTeacherProfile(){
     List<Teacher> list = new ArrayList<>();
     Teacher teacher = null;
     try {
         Connection connection = connectToSqlDatabase();
         String query = "Select * From Teacher";
         Statement stmt = connection.createStatement();
         ResultSet resultSt = stmt.executeQuery(query);
         while(resultSet.next()){
             int id = resultSet.getInt("id");
             String name = resultSet.getString("Name");
             String subject = resultSet.getString("Subject");
            teacher = new Teacher(id,name,subject);
            list.add(teacher);
         }

     } catch (IOException e) {
         e.printStackTrace();
     } catch (SQLException throwables) {
         throwables.printStackTrace();
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     }

     return list;
    }
    public static void main(String[] args) {
        System.out.println("Hello database");
        List<Teacher> list = readTeacherProfile();
        for(Teacher teacher:list){
            System.out.println(teacher.getId()+ " " + teacher.getName()+ " " + teacher.getSubject());
        }
    }
}
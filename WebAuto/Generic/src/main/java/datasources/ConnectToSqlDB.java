package datasources;

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

    public static Properties loadLocalProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("C:\\Users\\ortiz\\eclipse-workspace\\Web-automation-Sept2020\\Generic\\src\\main\\local-secret.properties.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToLocalSQLDB() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = loadLocalProperties();
        String driverClass = properties.getProperty("MYSQLJDBC.driver");
        String url = properties.getProperty("MYSQLJDBC.url");
        String userName = properties.getProperty("MYSQLJDBC.userName");
        String password = properties.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        return connect;
    }
    public static Properties loadOnlineProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("C:\\Users\\ortiz\\eclipse-workspace\\Web-automation-Sept2020\\Generic\\src\\main\\aws-secret.properties.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToOnlineSQLDB() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = loadOnlineProperties();
        String driverClass = properties.getProperty("MYSQLJDBC.driver");
        String url = properties.getProperty("MYSQLJDBC.url");
        String userName = properties.getProperty("MYSQLJDBC.userName");
        String password = properties.getProperty("MYSQLJDBC.password");
        Class.forName(driverClass);
        connect = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        return connect;
    }




    public List<String> readLocalDatabase(String tableName, String columnName) throws Exception{
        List<String> data = new ArrayList<>();

        try{
            connectToLocalSQLDB();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet,columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        } finally{
            close();
        }
        return data;
    }

    public List<String> readOnlineDatabase(String tableName, String columnName) throws Exception{
        List<String> data = new ArrayList<>();

        try{
            connectToOnlineSQLDB();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("select * from " + tableName);
            data = getResultSetData(resultSet,columnName);
        } catch (ClassNotFoundException e) {
            throw e;
        } finally{
            close();
        }
        return data;
    }

    private void close(){
        try{
            if(resultSet !=null){
                resultSet.close();
            }
            if(statement != null){
                statement.close();
            }
            if(connect != null){
                connect.close();
            }
        }catch(Exception e){

        }
    }
    private List<String> getResultSetData(ResultSet resultSet2, String columnName) throws SQLException{
        List<String> dataList = new ArrayList <>();
        while(resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }


}

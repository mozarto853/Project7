package datasupply;

import datasources.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {


    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getFoodListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("foods", "meal");
        return list;
    }

    public List<String> getSupplyListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("supplies", "utencil");
        return list;
    }

    public List<String> getGameList() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("games", "game");
        return list;
    }

    public List<String> getPhoneList() throws Exception {
        List<String> list = connectToSqlDB.readOnlineDatabase("appliances", "phone");
        return list;
    }

    public List<String> getBookList() throws Exception {
        List<String> list = connectToSqlDB.readOnlineDatabase("books", "book");
        return list;
    }
}


package methods;

import datasources.ConnectToSqlDB;

import java.util.List;

public class MySQL {


    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getAuthorListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readOnlineDatabase("books", "author");
        return list;
    }

    public List<String> getBookListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readOnlineDatabase("books", "book");
        return list;
    }

    public List<String> getFoodListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("foods", "meal");
        return list;
    }

    public List<String> getSupplyListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("supplies", "utencil");
        return list;
    }

    public List<String> getGameListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readLocalDatabase("games", "game");
        return list;
    }

    public List<String> getPhoneListFromDB() throws Exception {
        List<String> list = connectToSqlDB.readOnlineDatabase("appliances", "phone");
        return list;
    }
}

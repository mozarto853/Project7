package search;

import base.CommonAPI;
import datasupply.DataReader;
import datasupply.ItemArray;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TestSearch extends CommonAPI {

/*
    @Test
    public void test1(){
        List<String> list = SearchItems.getSearchItems();
        for(String items:list) {

            typeANDEnter("twotabsearchtextbox", items);
            clearInputField("twotabsearchtextbox");
        }
    } */

 DataReader dataReader = new DataReader();
 ItemArray itemArray = new ItemArray();

 /*
    @Test
    public void foodList() throws Exception {

        List<String> list = dataReader.getFoodListFromDB();
        for(String items:list) {
            typeANDEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }


    @Test
    public void schoolSuppliesList() throws Exception {
        List<String> list = dataReader.getSupplyListFromDB();
        for(String items:list) {
            typeANDEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void videoGameList() throws Exception {
        List<String> list = dataReader.getGameList();
        for(String items:list) {
            typeANDEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void phoneList() throws Exception {
        List<String> list = dataReader.getPhoneList();
        for(String items:list) {
            typeANDEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }


    //ArrayList Search
    @Test
    public void listComputers() throws Exception {
        List<String> list = ItemArray.getComputerListArray();
        for (String computers : list) {

            typeANDEnter("#twotabsearchtextbox", computers);
            clearInputField("#twotabsearchtextbox");
        }
    }

  */

    @Test
    public void candyList() throws Exception {
        List<String> list = ItemArray.getCandyListArray();
        for (String candy : list) {
            typeANDEnter("#twotabsearchtextbox", candy);
            clearInputField("#twotabsearchtextbox");
        }
    }


}

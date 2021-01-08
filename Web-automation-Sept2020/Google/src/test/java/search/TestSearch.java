package search;

import base.CommonAPI;
import methods.ItemArray;
import methods.MySQL;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

public class TestSearch extends CommonAPI {
    MySQL mySQL = new MySQL();



    //Basic Searchs
    @Test
    public void basicSearch() {
        typeANDEnter(".gLFyf.gsfi", "Planet Earth");
        clearInputField(".gLFyf.gsfi");
    }

    @Test
    public void basicSearch2() {
        typeANDEnter(".gLFyf.gsfi", "QA Automation Engineer");
        clearInputField(".gLFyf.gsfi");
    }

    @Test
    public void basicSearch3() {
        typeANDEnter(".gLFyf.gsfi", "What does Java taste like?");
        clearInputField(".gLFyf.gsfi");
    }
/*
    @Test
    public void basicSearchPresidents() {
        typeANDEnter(".gLFyf.gsfi","Joe Biden");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Barack Obama");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Donald Trump");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","HillaryClinton");
        clearInputField(".gLFyf.gsfi");
    }

    @Test
    public void basicSearchSupremeCourtJustices() {
        typeANDEnter(".gLFyf.gsfi","John G. Roberts");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Clarence Thomas");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Stephen G. Breyer");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Samuel A. Alito");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Sonia Sotomayor");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Elena Kagan");
        clearInputField(".gLFyf.gsfi");
    }

    @Test
    public void basicSenatorSearch(){
        typeANDEnter(".gLFyf.gsfi","Alexandria Ocasio Cortez");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Ilhan Omar");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Rashida Tlaib");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Moscow Mitch");
        clearInputField(".gLFyf.gsfi");
    }

    @Test
    public void basicCompanySearch(){
        typeANDEnter(".gLFyf.gsfi","Apple");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Microsoft");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","Sony");
        clearInputField(".gLFyf.gsfi");
        typeANDEnter(".gLFyf.gsfi","PanaSonic");
        clearInputField(".gLFyf.gsfi");
    }

    //ArrayList Search
    @Test
    public void listComputers() throws Exception {
        List<String> list = ItemArray.getComputerListArray();
        for (String computers : list) {

            typeANDEnter(".gLFyf.gsfi", computers);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void candyList() throws Exception {
        List<String> list = ItemArray.getCandyListArray();
        for (String candy : list) {
            typeANDEnter(".gLFyf.gsfi", candy);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void animalList() throws Exception {
        List<String> list = ItemArray.animalList();
        for (String animal : list) {
            typeANDEnter(".gLFyf.gsfi", animal);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void animeList() throws Exception {
        List<String> list = ItemArray.animeList();
        for (String anime : list) {
            typeANDEnter(".gLFyf.gsfi", anime);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void ideList() throws Exception {
        List<String> list = ItemArray.apiList();
        for(String api : list) {
            typeANDEnter(".gLFyf.gsfi",api);
            clearInputField(".gLFyf.gsfi");
        }
    }


    //My SQL Searchs
    @Test
    public void authorList() throws Exception {
        List<String> list = mySQL.getAuthorListFromDB();
        for (String author : list) {
            typeANDEnter(".gLFyf.gsfi", author);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void bookList() throws Exception {
        List<String> list = mySQL.getBookListFromDB();
        for (String book : list) {
            typeANDEnter(".gLFyf.gsfi", book);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void foodList() throws Exception {
        List<String> list = mySQL.getFoodListFromDB();
        for (String food : list) {
            typeANDEnter(".gLFyf.gsfi",food);
            clearInputField(".gLFyf.gsfi");
        }
    }

    @Test
    public void gameList() throws Exception {
        List<String> list = mySQL.getGameListFromDB();
        for (String games : list) {
            typeANDEnter(".gLFyf.gsfi", games);
            clearInputField(".gLFyf.gsfi");
        }
    }


 */

}

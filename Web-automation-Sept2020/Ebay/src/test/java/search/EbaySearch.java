package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.List;

public class EbaySearch extends CommonAPI {
    @Test
    public void test1(){
        typeANDEnter("#gh-ac","Playstation 5");
        clearInputField("gh-ac");
    }
}

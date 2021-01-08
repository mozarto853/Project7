package testTableData;

import org.testng.annotations.Test;
import table.SqlTablePage;

public class TestWebTableData extends SqlTablePage {



    //Read the full table
    @Test
    public void fullTable(){
        readFullTable1();
    }

    //Read the columns
    @Test
    public void readWebRow1(){
        readTableRow1();
    }

    @Test
    public void readWebRow2(){
        readTableRow2();
    }

    @Test
    public void readWebRow3(){
        readTableRow3();
    }

    @Test
    public void readWebRow4(){
        readTableRow4();
    }

    @Test
    public void readWebRow5(){
        readTableRow5();
    }

    @Test
    public void readWebRow6(){
        readTableRow6();
    }


    //Read the names
    @Test
    public void readWebName1(){
        readCustomerNames1();
    }

    @Test
    public void readWebName2(){
        readCustomerNames2();
    }

    @Test
    public void readWebName3(){
        readCustomerNames3();
    }

    @Test
    public void readWebName4(){
        readCustomerNames4();
    }

    @Test
    public void readWebName5(){
        readCustomerNames5();
    }

    //Read Random Things from the page
    @Test
    public void note(){
        readNOTE();
    }

    @Test
    public void finalRead(){
        readLinksAtTheBottom();
    }

    @Test
    public void readHowSection(){
        readHOWTO();
    }

}

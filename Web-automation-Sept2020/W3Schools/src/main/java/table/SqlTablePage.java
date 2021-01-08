package table;

import base.CommonAPI;

public class SqlTablePage extends CommonAPI {

    public void readNOTE(){
        String note = getWebText("//*[@id=\"main\"]/div[4]/p");
        System.out.println(note);
    }

    public void readFullTable1(){
        String tableData = getWebText(".w3-table-all.notranslate");
        System.out.println(tableData);
    }

    public void readTableRow1(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(1)" );
        System.out.println(tableData);
    }
    public void readTableRow2(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(2)" );
        System.out.println(tableData);
    }
    public void readTableRow3(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(3)");
        System.out.println(tableData);
    }
    public void readTableRow4(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(4)" );
        System.out.println(tableData);
    }

    public void readTableRow5(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(5)" );
        System.out.println(tableData);
    }

    public void readTableRow6(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(6)" );
        System.out.println(tableData);
    }


    //customer Name
    public void readCustomerNames1(){
        String tableData = getWebText(".w3-table-all.notranslate td:nth-child(2)");
        System.out.println(tableData);
    }

    public void readCustomerNames2(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(3) td:nth-child(2)");
        System.out.println(tableData);
    }

    public void readCustomerNames3(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(2)");
        System.out.println(tableData);
    }

    public void readCustomerNames4(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(2)");
        System.out.println(tableData);
    }

    public void readCustomerNames5(){
        String tableData = getWebText(".w3-table-all.notranslate tr:nth-child(6) td:nth-child(2)");
        System.out.println(tableData);
    }

    //Table at the bottom

    public void readLinksAtTheBottom(){
        String list = getWebText(".w3-row.w3-center.w3-small");
        System.out.println(list);
    }

    //Table on the side
    public void readHOWTO(){
        String list = getWebText(".sidesection.w3-light-grey");
        System.out.println(list);
    }

}


package datafetch;

import datasources.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String [] data = excelFile.fileReader2("C:\\Users\\ortiz\\eclipse-workspace\\WebAuto\\NYPost\\src\\data\\nyp-test-steps.xls", 0);

        return data;
    }
}
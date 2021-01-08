package datafetch;

import datasources.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {

    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("C:\\Users\\ortiz\\eclipse-workspace\\Web-automation-Sept2020\\NYPost\\src\\main\\java\\datafetch\\nyp-test-steps.xlsx");
        String [] data = excelFile.fileReader2(path, 0);

        return data;
    }
}

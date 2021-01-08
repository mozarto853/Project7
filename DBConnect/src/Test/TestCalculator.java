package Test;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        int expectedResult = cal.addition(10,5);
        int actualResult =(15);
        Assert.assertEquals(expectedResult,actualResult);

        Food food = new Food();
        String expectedFood = Food.dessert;
        String actualFood = "Pie";
        Assert.assertEquals(expectedFood, actualFood);





    }
}

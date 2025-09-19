import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    @DataProvider
    public Object[][] negativeData (){
        return new Object[][] {
                {"+", "2147483647", "1"},
                {"-", "-2147483648", "1"},
                {"%", "4", "5"},
                {"/", "10", "0"},
                {"+", "9999999999", "1"}
        };
    }

    @Test(dataProvider = "negativeData", expectedExceptions = CalculatorException.class)
    public void negativeTest(String operator, String first, String second){
        String[] params = {operator, first, second};
        Calculator.execute(params);
    }
}

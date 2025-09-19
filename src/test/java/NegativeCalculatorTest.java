import model.Calculator;
import model.CalculatorException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeCalculatorTest {
    @DataProvider
    public Object[][] negativeData (){
        return new Object[][] {
                {"+", String.valueOf(Integer.MAX_VALUE), "1"},
                {"-", String.valueOf(Integer.MIN_VALUE), "1"},
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

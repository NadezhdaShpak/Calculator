import model.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveCalculatorTest {

    @DataProvider
    public Object[][] positiveData(){
        return new Object[][] {
                {"+", "2", "3", 5.0},
                {"-", "5", "3", 2.0},
                {"*", "4", "5", 20.0},
                {"/", "10", "2", 5.0},
                {"*", "0", "0", 0.0},
                {"-", "0", "5", -5.0},
                {"*", "0", "100", 0.0},
                {"/", "7", "2", 3.5},
                {"+", "-2", "3", 1.0},
                {"-", "-5", "-3", -2.0},
                {"*", "-4", "5", -20.0},
                {"/", "-10", "2", -5.0},
                {"+", "2147483646", "1", 2147483647},
                {"-", "-2147483647", "1", -2147483648},
        };
    }

    @Test (dataProvider = "positiveData")
    public void positiveTest(String operator, String first, String second, double expected){
        String[] params = {operator, first, second};
        String res = Calculator.execute(params);
        double actual = Double.parseDouble(res);
        Assert.assertEquals(actual, expected, 0.001);
    }
}

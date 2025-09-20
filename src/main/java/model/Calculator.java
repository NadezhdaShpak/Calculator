package model;

public class Calculator {

    public static String execute(String[] params) {
        String operator = params[0];
        double value1;
        double value2;
        double result;
        try {
            value1 = Double.parseDouble(params[1]);
            value2 = Double.parseDouble(params[2]);
            if (value1 < Integer.MIN_VALUE || value1 > Integer.MAX_VALUE ||
                    value2 < Integer.MIN_VALUE || value2 > Integer.MAX_VALUE) {
                throw new CalculatorException("Превышен порог значений");
            }
            result = calculate(operator, value1, value2);
            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
                throw new CalculatorException("Превышен порог значения результата");
        } catch (NumberFormatException | NullPointerException e) {
            throw new CalculatorException("Некорректный формат числа");
        } catch (CalculatorException e) {
            throw new CalculatorException(e.getMessage());
        }

        return String.valueOf(result);
    }

    private static double calculate(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return add(a, b);
            case "-":
                return subst(a, b);
            case "*":
                return mult(a, b);
            case "/":
                return div(a, b);
        }
        throw new CalculatorException("Неизвестный оператор");
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double subst(double a, double b) {
        return a - b;
    }

    private static double div(double a, double b) {
        if (b == 0) {
            throw new CalculatorException();
        }
        return a / b;
    }

    private static double mult(double a, double b) {
        return a * b;
    }
}

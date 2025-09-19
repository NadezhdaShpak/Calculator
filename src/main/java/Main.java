import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] params = readParams();
        System.out.println(Calculator.execute(params));
    }

    private static String[] readParams() {
        // todo: считать из консоли данные, затем вернуть их в виде массива строк
        return null;
    }
}

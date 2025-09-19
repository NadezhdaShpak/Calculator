import model.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] params = readParams();
        System.out.println(Calculator.execute(params));
    }

    private static String[] readParams() {
        // todo: считать из консоли данные, затем вернуть их в виде массива строк
        Scanner sc = new Scanner(System.in);
        String[] params = new String[3];
        params[0] = sc.nextLine();
        params[1] = sc.nextLine();
        params[2] = sc.nextLine();
        return params;
    }
}

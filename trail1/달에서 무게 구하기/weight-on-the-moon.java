import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int weight = 13;
        double rate = 0.165;

        double result = weight * rate;

        System.out.printf("%d * %.6f = %.6f", weight, rate, result);

    }
}
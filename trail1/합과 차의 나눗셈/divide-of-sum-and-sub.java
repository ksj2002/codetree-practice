import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int a = sc.nextInt();
         int b = sc.nextInt();

         double sum = a + b;
         double minus = a - b;
         
         double result = sum/minus;

        System.out.printf("%.2f", result);

    }
}

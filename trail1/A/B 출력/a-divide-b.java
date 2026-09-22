import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.print(a / b + ".");

        int r = (a % b) * 10;

        for (int i = 0; i < 20; i++){
            int n = r / b;

            System.out.print(n);

            r = (r % b) * 10;
        }

    }
}
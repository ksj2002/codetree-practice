import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            for (int k = 0; k < 2 * i; k++) {
                System.out.print(" ");
            }

            for (int z = 0; z < n - i; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
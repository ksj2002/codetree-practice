import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n; j > n - i; j--) {
                System.out.print("  ");
            }

            for (int k = n - i; k > 0; k--){
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if ((m % 2) == 0) {
                arr[num] = m;
                num++;
            }
        }

        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
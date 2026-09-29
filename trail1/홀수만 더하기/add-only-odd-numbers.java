import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sumVal = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            if ((arr[i] % 2 == 1) && (arr[i] % 3 == 0)) {
                sumVal += arr[i];
            }
        }

        System.out.println(sumVal);
    }
}
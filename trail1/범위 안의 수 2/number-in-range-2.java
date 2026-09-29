import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        int sumVal = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] >= 0 && arr[i] <= 200) {
                sumVal += arr[i];
                count++;
            }
        }

        double avg = (double)sumVal / count;

        System.out.print(sumVal + " ");
        System.out.printf("%.1f", avg);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int num = 10;
        double avg = 0;
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > 250) {
                num = i;
                break;
            }
        }

        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }

        avg = avg = (double)sum / num;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);

    }
}
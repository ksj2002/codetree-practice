import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int num = 10;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] == 0) {
                num = i;
                break;
            }

            sum += arr[i];
        }

        avg = (double) sum / num;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}
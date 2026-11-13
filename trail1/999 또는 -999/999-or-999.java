import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int Max_Value = Integer.MAX_VALUE;
        final int Min_Value = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int minVal = Max_Value;
        int maxVal = Min_Value;

        for (int i  = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }

            if (arr[i] < minVal) {
                minVal = arr[i];
            }

            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        System.out.println(maxVal + " " + minVal);
    }
}
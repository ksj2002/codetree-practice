import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int Max_Value = Integer.MAX_VALUE;
        final int Min_Value = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int minVal = Max_Value;
        int maxVal = Min_Value;

        for (int i  = 0; i < 10; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < minVal && arr[i] > 500) {
                minVal = arr[i];
            }

            if (arr[i] > maxVal && arr[i] < 500) {
                maxVal = arr[i];
            }
        }

        System.out.println(maxVal + " " + minVal);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = sc.nextInt();
        int[] arr = new int[100];
        int[] countArr = new int[9];

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            
            if ((arr[i] / 10) > 0) {
                countArr[(arr[i] / 10) - 1]++;
            }

            if (arr[i] == 0) {
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            System.out.println( (i + 1) + " - " + countArr[i]);
        }
    }
}
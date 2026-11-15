import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        double totalAvg = 0;
        double totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                totalSum += arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            double rowAvg = 0;
            double rowSum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
                rowAvg = rowSum / 4;
            }
            System.out.printf("%.1f ", rowAvg);
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            double columnAvg = 0;
            double columnSum = 0;

            for (int j = 0; j < 2; j++) {
                columnSum += arr[j][i];
                columnAvg = columnSum / 2;
            }
            System.out.printf("%.1f ", columnAvg);
        }

        totalAvg = totalSum / 8;

        System.out.println();
        System.out.printf("%.1f ", totalAvg);
    }
}

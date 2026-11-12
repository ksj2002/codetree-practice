import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int menu = sc.nextInt();

            if (menu == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a -1]);
            } else if (menu == 2) {
                int b = sc.nextInt();
                int num = -1;

                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        num = j;
                        break;
                    }
                }

                if (num != -1) {
                    System.out.println(num + 1);
                }else  {
                    System.out.println(0);
                }
            } else if (menu == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for(int j = (s - 1); j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
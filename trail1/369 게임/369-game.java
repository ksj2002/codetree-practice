import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {
            if (i % 3 == 0){
                System.out.print(0 + " ");
                i++;
                continue;
            }

            String c = String.valueOf(i);

            if (c.contains("3") ||c.contains("6") || c.contains("9")){
                System.out.print(0 + " ");
            }else {
                System.out.print(i + " ");
            }

            i++;
        }

    }
}
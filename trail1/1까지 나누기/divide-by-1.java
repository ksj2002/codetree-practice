import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = n;
        int count = 1;

        for (int i = 2; ;i++) {
            result /= i;

            count++;

            if(result <= 1){
                System.out.println(count);
                break;
            }
        }
    }
}
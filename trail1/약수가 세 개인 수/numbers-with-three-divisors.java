import java.util.Scanner;

//자기 자신을 뺀 약수의 합이 자기자신인수

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int rcnt = 0;
        
        for (int i = start; i <= end; i++) {
            int cnt = 0;
            
            for (int j = 1; j <= i; j++) {

                if ((i % j) == 0) {
                    cnt++;
                }
            }
            
            if (cnt == 3) {
                rcnt++;
            }
        }
        System.out.println(rcnt);
    }
}
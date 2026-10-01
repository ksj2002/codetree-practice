import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int sumVal = 0;
        while (true) {
            int age = sc.nextInt();
            
            if((age / 10) != 2){
                break;
            }
            
            count++;
            sumVal += age;
        }
        
        double avg = (double)sumVal / count;

        System.out.printf("%.2f", avg);
            
    }
}
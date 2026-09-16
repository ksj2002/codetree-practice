import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a_symptom = sc.next();
        int a_fever = sc.nextInt();
        String b_symptom = sc.next();
        int b_fever = sc.nextInt();
        String c_symptom = sc.next();
        int c_fever = sc.nextInt();

        int count = 0;

        if (a_symptom.equals("Y") && a_fever >= 37) {
            count++;
        }

        if (b_symptom.equals("Y") && b_fever >= 37) {
            count++;
        }

        if (c_symptom.equals("Y") && c_fever >= 37) {
            count++;
        }

        if(count >= 2) {
            System.out.println("E");
        }else {
            System.out.println("N");
        }

    }
}
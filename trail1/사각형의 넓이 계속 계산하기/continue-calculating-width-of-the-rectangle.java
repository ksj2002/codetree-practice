import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int length = sc.nextInt();
            String end = sc.next();

            System.out.println(width * length);
            
            if (end.equals("C")){
                break;
            }
        }
    }
}
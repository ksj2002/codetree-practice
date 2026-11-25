import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        boolean b = false;
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine();
        }

        char check = sc.next().charAt(0);

        for (int i = 0; i < 10; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == check) {
                System.out.println(arr[i]);
                b = true;
            }
        }
        
        if (!b) System.out.println("None");
    }
}
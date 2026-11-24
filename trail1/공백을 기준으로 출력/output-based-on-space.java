import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for (int j = 0; j < 2; j++) {
            String line = sc.nextLine();
            
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c != ' ') System.out.print(c);
            }
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        char c = sc.next().charAt(0);
        int cnt = 0;

        for (int i  = 0; i < st.length(); i++) {
            if(st.charAt(i) == c) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}
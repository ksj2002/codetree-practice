import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        String check = sc.next();
        int startIdx = 0;
        
        startIdx = st.indexOf(check);
        
        if (startIdx != -1) {
            System.out.println(startIdx);
        }else {
            System.out.println("No");
        }
    }
}
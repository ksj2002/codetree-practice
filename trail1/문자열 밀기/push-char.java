import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        int len = st.length();
        
        st = st.substring(1, len) + st.charAt(0);
        
        System.out.println(st);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st  = sc.nextLine();
        
        if (st.contains("ee")) {
            System.out.print("Yes ");
        }else {
            System.out.print("No ");
        }
        
        if (st.contains("ab")) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }
    }
}
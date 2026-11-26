import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        
        if(st.length() % 2 == 0) {
            for (int i = st.length() - 1; i >= 0; i -= 2){
                System.out.print(st.charAt(i));
            }
        }else {
            for (int i = st.length() - 2; i >= 0; i -= 2){
                System.out.print(st.charAt(i));
            }
        }
    }
}
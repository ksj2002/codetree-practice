import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st1 = sc.next();
        String st2 = sc.next();

        char arr1[] = st1.toCharArray();
        char arr2[] = st2.toCharArray();
        
        arr2[0] = arr1[0]; 
        arr2[1] = arr1[1]; 
        
        System.out.println(arr2);
    }
}
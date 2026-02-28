import java.util.*;
public class primenumber {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = 0;
        int c;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                b++;
        }
        if (b > 0) {
            System.out.println("not prime");
        } else {
            System.out.println("Is prime");
            
        }
    }
}












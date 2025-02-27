// 1) prime number within a given range

import java.util.*;

public class RangeofPrimenumber {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int n = q.nextInt();
        System.out.println("Enter any random number: " + n);
        for (int i = 2; i <= n; i++) {
            int b = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b++;
                    break;
                }
            }
            if (b == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
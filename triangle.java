import java.util.*;

class triangle {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("valid triangle");
        } else {
            System.out.println("not valid triangle");
        }

    }

}

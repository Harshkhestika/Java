import java.util.*;

class triangle {
    
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        int a = q.nextInt();
        int b = q.nextInt();
        int c = q.nextInt();
        
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("Valid triangle");
        } 
        else {
            System.out.println("Not valid triangle's");
        }

    }

}










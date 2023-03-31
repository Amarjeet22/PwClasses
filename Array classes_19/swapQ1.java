package lactNo19Pw;
//given 2 integer a ans b swip the 2 given value using temparary variable .
import java.util.Scanner;

public class swapQ1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a =");
        int a = sc.nextInt();
        System.out.println("Enter the value of b =");
        int b = sc.nextInt();
        // now we have tp swap a and b
        int trmp = 0;
        trmp =a;
        a=b;
        b=trmp;
        System.out.println( "a = "+ a );
        System.out.println("b = "+b );

    }
}

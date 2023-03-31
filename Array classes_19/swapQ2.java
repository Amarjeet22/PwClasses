package lactNo19Pw;

import java.util.Scanner;

// swap a and b without using temp var
public class swapQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a =");
        int a = sc .nextInt();
        System.out.println("Enter the value of b =");
        int b = sc.nextInt();
        int sum = a+b; // a =a+b
        a=sum-a; //b=a-b
        b=sum-b; //a =a-b
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}

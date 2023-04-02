package lactNo20Pw;
// given an array of integers 'a' move all the even element at the beginnig of the array followed by all the
// odd integ the relative order of odd or even integers does not Matter
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array n = ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the element of an array ");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans [] = new int[n];
        int j = 0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]%2==0){
                ans[j]=arr[i];
                j++;
            }

        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]%2!=0){
                ans[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

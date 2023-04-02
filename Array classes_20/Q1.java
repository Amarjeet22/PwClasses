package lactNo20Pw;
//sort an array consisting of only 0s and 1s
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Element of an array put only 0s and 1s");
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int ans[]= new int[n]; // making new array
        int j =0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==0){
                ans[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]==1){
                ans[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(ans[i]+ " ");
        }

    }
}

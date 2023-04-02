package lactNo21Pw;

import java.util.Scanner;

public class Q3 {
    static  void printArray(int[]arr){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array n=");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " element of an array");
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        //Prifix
        int prifx[] = new int[n];
        prifx[0] = arr[0];
        for (int i = 1; i <n ; i++) {
            prifx[i]=prifx[i-1]+arr[i];
        }
        //suffix
       int sufix[] = new int[n];
        sufix[n-1] =arr[n-1];
        for (int i = n-2; i >=0 ; i--) {
            sufix[i] = sufix[i+1]+arr[i];
        }
        printArray(prifx);
        printArray(sufix);

        }

}



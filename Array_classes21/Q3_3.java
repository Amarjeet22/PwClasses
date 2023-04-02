package lactNo21Pw;

import java.util.Scanner;
//check if we can partition the array into two subbarray with equal sum More formally check that the prefix sum of a part
//of the array is equal to the suffix sum of rest of the array
public class Q3_3 {
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i <arr.length ; i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
         int totalSum = findArraySum(arr);

         int prifSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prifSum +=arr[i];
            int suffixSum = totalSum-prifSum;
            if(suffixSum ==prifSum){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter  " +n+ " element of an array" );
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Element partition possible:= "+ equalSumPartition(arr));
    }


}

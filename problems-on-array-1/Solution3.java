//Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//        missing number from the first N integers. There are no duplicates in the list.

import java.util.Scanner;

public class Solution3 {
     static int arraySum(int arr[]){
         int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
         }
         return sum;

    }
    static  int missingNumber(int arr[],int N){
        int sumOfFirstNaturalNumber=N*(N+1)/2;
        int sumOfArray=arraySum(arr);
        return sumOfFirstNaturalNumber-sumOfArray;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range");
        int N= sc.nextInt();
        int arr[]=new int[N-1];
        System.out.println("enter "+(N-1)+" element in array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("missing no . is: "+missingNumber(arr,N));

    }
}

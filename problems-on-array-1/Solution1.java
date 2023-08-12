//- Given an array sorted in increasing order of size n and an integer x, find if there exists a
//        pair in the array whose absolute difference is exactly x.(n>1)
import java.util.Scanner;

public class Solution1 {
    static boolean checkAvailable(int arr[],int x){
        for(int i=0;i<arr.length;i++){

            for(int j = i+1; j<arr.length; j++){
                if((Math.abs(arr[i]-arr[j])) ==x) return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= {5,10,15,20,26};
        System.out.println("enter no. you want to check existence of pair for absolute difference");
        int x=sc.nextInt();
       if(checkAvailable(arr,x)) System.out.println("yes");
       else System.out.println("no");

    }
}

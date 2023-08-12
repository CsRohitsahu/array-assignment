import java.util.Scanner;

//given an array of size n, find the total number of occurrences of given number x.
public class Solution2 {
    static  int occuranceOf(int arr[],int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = {3, 5, 0, 7, 8, 3, 0};
        System.out.println("enter no. to find occurance of in array:");
        int x=sc.nextInt();
        System.out.println("occurance of "+x+" is "+occuranceOf(arr,x));

    }
}

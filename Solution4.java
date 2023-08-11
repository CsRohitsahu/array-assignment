import java.util.Arrays;

public class Solution4 {
    public static void main(String[] args) {
        int arr[]={2,-3,5,8,1,0,-4};
             int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("minimum element is :"+min);
    }
    
}

package January2025;
import java.util.* ;
import java.io.*; 

public class Day2 {

    static int minDiff(int n, int[] arr) {
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){ //loop till second last element 
            int diff=Math.abs(arr[i]-arr[i+1]); //to find the absolute difference
            
            if(diff<minDiff){
                minDiff=diff;
            }
        }
        return minDiff;

    }

    public static void main(String[] args) {
        int arr[]={3,-6,7,-7,0};
        System.out.println(minDiff(5, arr));
    }
}

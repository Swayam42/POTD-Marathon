package GFG;
import java.util.*;
public class Day2 {
    /*bruteForce Approach :
    static int countSubarrays(int arr[],int k){
        
        int c=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=i;j<arr.length;j++){
                s+=arr[j];
                if(s==k){
                    c++;
                }
            }
        }
        return c;
    } */

    static int countSubArraysWithSumK(int arr[],int k){
        int count=0;  //to count the no. of subarrays
        int currSum=0; //to find the sum of each element & update it accordingly

        //creating a hashMap to store the prefixSum and frequency of it : 
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);//intitally 
        //traversing through each element of array
        for(int i:arr){
            currSum+=i;
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);

        }   

        return count;
    }
    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        //System.out.println(countSubarrays(arr, -10));
        System.out.println(countSubArraysWithSumK(arr, -10));
    }
}

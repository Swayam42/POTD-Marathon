/*Given an array of integers, find the Kth largest sum subarray For example, 
given the array [1, -2, 3, -4, 5] and K = 2, the 2nd largest sum subarray would be 
[3, -4, 5], which has a sum of 4.
*/

import java.util.ArrayList;
import java.util.Collections;
public class Day1 {

	public static int getKthLargest(ArrayList<Integer> arrList, int k) {
		//an ArrayList sum to store all the sums of possible subarrays of given array 
		ArrayList<Integer> sum = new ArrayList<>();

		//
		for(int i=0;i<arrList.size();i++){
			int s=0;
			for(int j=i;j<arrList.size();j++)
			{
				s+=arrList.get(j);
				sum.add(s);
			}
		}
		
		Collections.sort(sum,Collections.reverseOrder());
		return sum.get(k-1);
	}

	public static void main(String[] args) {
		int arr[]={1, -2, 3, -4, 5};
		
		//convert array to arrayList :
		ArrayList <Integer> list=new ArrayList<Integer>();
		for(int i:arr){
			list.add(i);
		}

		System.out.println(getKthLargest(list, 2));
	}
}

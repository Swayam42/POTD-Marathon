/*Given an array of integers, find the Kth largest sum subarray For example, given the array [1, -2, 3, -4, 5] and K = 2, the 2nd largest sum subarray would be [3, -4, 5], which has a sum of 4.

Please note that a subarray is the sequence of consecutive elements of the array. 
explain this to a 10yr old kid and code in java*/

import java.util.ArrayList;
import java.util.Collections;
public class Solution {

	public static int getKthLargest(ArrayList<Integer> arr, int k) {

		ArrayList<Integer> sum = new ArrayList<>();

		for(int i=0;i<arr.size();i++){
			int s=0;
			for(int j=i;j<arr.size();j++)
			{
				s+=arr.get(j);
				sum.add(s);
			}
		}
		Collections.sort(sum,Collections.reverseOrder());
		return sum.get(k-1);
	}
}

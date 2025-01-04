/*This year Santa Claus got a magic bag for bringing gifts for children. So magical thing about this magic bag is that, whenever the number of gifts inside the bag becomes strictly less than 'K' gifts, it automatically refills back to its full capacity(say its capacity is of 'N' gifts). Now a child can ask for 'M' (some positive integer less than 'N') gifts from Santa. This reduces the number of gifts in the bag by 'M'.

On the occasion of Christmas, when Santa Claus arrived, children of your locality made a queue for taking gifts from Santa Claus. But some greedy kids can ask for more gifts than the current number of gifts in the bag which is regarded as invalid demand and that kid doesn't get any gift.

You are watching this distribution of gifts, and become curious about knowing the number of gifts remaining in Santa's bag after giving gifts to a kid. You get the ordered list of demands of kids as 'DEMANDS', can you tell which are invalid demands and how many gifts left in the bag if the demand is valid?

Note:

1. You can assume Magic Bag is completely filled initially.

2. If the demand by a kid is invalid print -1 which will denote this invalid demand.
*/
class Solution {
    public long subarrayXor(int arr[], int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int prefixXOR = 0;
        int count = 0;

        for (int num : arr) {
         
            prefixXOR ^= num;

            if (prefixXOR == k) {
                count++;
            }
            int target = prefixXOR ^ k;
            if (freq.containsKey(target)) {
                count += freq.get(target);
            }
            freq.put(prefixXOR, freq.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }

    public class Main {
    public static void main(String[] args) {
        int n = 10; // Full capacity of the bag
        int k = 5;  // Refill threshold
        int q = 5;  // Number of demands
        int[] demands = {3, 7, 6, 2, 11}; // Kids' demands

        int[] results = Solution.giftsLeft(n, k, q, demands);

        // Print the results
        for (int result : results) {
            System.out.println(result);
        }
    }
}
}

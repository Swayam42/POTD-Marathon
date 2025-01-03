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
}

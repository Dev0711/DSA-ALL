class Solution {
    public int singleNumber(int[] nums) {
          HashMap<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (counts.get(num) == 1) {
                return num;
            }
        }

        return -1; 
    }
}
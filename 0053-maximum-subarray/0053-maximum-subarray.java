class Solution {
    public int maxSubArray(int[] nums) {
    
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currentSum < 0) {
                currentSum = nums[i];       // drop the negative baggage, start fresh
            } else {
                currentSum = currentSum + nums[i]; // keep extending
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
        
    }
}
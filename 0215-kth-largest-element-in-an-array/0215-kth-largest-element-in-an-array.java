class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] boxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, Collections.reverseOrder());
        return boxed[k - 1];  
    }
}
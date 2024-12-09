class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k %= n;// for if reverse is greater then nums of arr whihc ex 10 so 10%7 = 3
        reverse(nums, 0, n-k-1);
        reverse(nums, n-k, n-1);
        reverse(nums, 0, n-1);
        
    }
    public static void reverse(int[] arr, int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
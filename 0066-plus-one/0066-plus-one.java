class Solution {
    public int[] plusOne(int[] digits) {
         for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;   // no carry needed, we're done
            }
            digits[i] = 0;       // 9 -> 0, carry continues to the left
        }

        // if we reach here, every digit was 9 (e.g. 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        // rest of result stays 0 by default
        return result;
    }
}
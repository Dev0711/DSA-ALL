class Solution {
    public int firstUniqChar(String s) {
             int[] counts = new int[26];

        // Pass 1: count every character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts[c - 'a']++;
        }

        // Pass 2: find first character with count == 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (counts[c - 'a'] == 1) {
                return i;
            }
        }

        return -1; // no unique character found
    }
    }

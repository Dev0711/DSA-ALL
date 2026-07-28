class Solution {
    public String reverseWords(String s) {
             String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String reversedWord = reverseWord(words[w]);
            result.append(reversedWord);
            if (w != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // your existing two-pointer swap, reused as a helper
    private String reverseWord(String word) {
        char[] ch = word.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    }

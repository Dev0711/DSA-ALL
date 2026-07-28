class Solution {
    public String reverseWords(String s) {
              char[] words = s.toCharArray();
              int start = 0;


        for (int end = 0; end <= words.length; end++) {
            if(end == words.length || words[end] == ' '){
                reverseWord(words, start, end -1);
                start = end + 1;
            }
      
        }
        return new String(words);
    }

    // your existing two-pointer swap, reused as a helper
    private void reverseWord(char[] words, int left, int right){
     
  
        while (left < right) {
            char temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
    
    
    }
}
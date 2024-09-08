class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
    int dup = x;
    int rev = 0;
    while(x != 0){
        int ld = x % 10;
        x = x/10;
        rev = (rev*10) + ld;
    }
        if(dup == rev){
            return true;
        }
       return false;  
    }
     
    }

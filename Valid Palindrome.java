public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s.length()==0) return true; 
        s=s.toLowerCase();
        int start=0, end=s.length()-1;
        while(start<end)
        {
            while(start<end && !(s.charAt(start)>='a' && s.charAt(start)<='z')&& !(s.charAt(start)>='0' && s.charAt(start)<='9'))
            {
                start++;
            }
            if(start>=end) break; 
            
            while(start<end && !(s.charAt(end)>='a' && s.charAt(end)<='z')&&!(s.charAt(end)>='0' && s.charAt(end)<='9'))
            {
                end--;
            }
            if(start>=end) break; 
            if(s.charAt(start)!=s.charAt(end)) return false; 
            start++; 
            end--; 
        }
        return true; 
    }

}



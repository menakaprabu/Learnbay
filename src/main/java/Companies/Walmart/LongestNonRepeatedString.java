package Companies.Walmart;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatedString {

    public static int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet();
        int i = 0, j = 0, ans = 0;
        int n = str.length();

        while(i<n && j<n){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                ans = Math.max(ans, j-i);
            }else{
                set.remove(str.charAt(i++));
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int ans = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Output = "+ans);
    }

}

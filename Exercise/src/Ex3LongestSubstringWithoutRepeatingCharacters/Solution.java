package Ex3LongestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * <p>
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * <p>
 * Given "bbbbb", the answer is "b", with the length of 1.
 * <p>
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(0, i);
            if (temp.contains(String.valueOf(s.charAt(i)))) {
//                if((i-1) - temp.indexOf(s.charAt(i-1)) == 1){
//                    sum = 2;
//                }
//                sum = i - temp.indexOf(s.charAt(i));
                sum = 1;
            } else {
                sum++;
            }
            list.add(sum);
        }
        System.out.println(list);
        return list.isEmpty() ? 0 : Collections.max(list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("dvdf"));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}

package Ex459RepeatedSubstringPattern;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 * Example 1:
 * Input: "abab"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 * Input: "aba"
 * <p>
 * Output: False
 * Example 3:
 * Input: "abcabcabcabc"
 * <p>
 * Output: True
 * <p>
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean result = false;
        for (int i = 1; i < s.length(); i++) {
            if (s.length() % i == 0)
                list.add(i);
        }
        if (s.length() == 2) {
            return s.charAt(0) == s.charAt(1);
        }
        for (Integer gap : list) {
            for (int i = 0; i < s.length(); i += gap) {
                String s1 = s.substring(0, 0 + gap);
                String s2 = s.substring(i, i + gap);

                if (s1.equals(s2)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (result) {
                return result;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatedSubstringPattern("aba"));
        System.out.println(solution.repeatedSubstringPattern("ababa"));
        System.out.println(solution.repeatedSubstringPattern("abcabc"));
        System.out.println(solution.repeatedSubstringPattern("a"));
        System.out.println(solution.repeatedSubstringPattern("abcaaabcaa"));
    }
}

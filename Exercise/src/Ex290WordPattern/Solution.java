package Ex290WordPattern;

import java.util.HashMap;

/**
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Example 1:
 * <p>
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 * <p>
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 */
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strings = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if (strings.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            System.out.println(map);
            if (map.containsKey(pattern.charAt(i))) {
                if (!strings[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else if (map.containsValue(strings[i])) {
                return false;
            } else {
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        return true;
    }

    public static void main(String[] strings) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
        System.out.println(solution.wordPattern("abba", "dog dog dog dog"));
    }
}

package Ex387FirstUniqueCharacterinaString;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 */
public class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1)
            return 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String after = s.substring(i + 1, s.length());
            String before = s.substring(0,i);
            if (!after.contains(String.valueOf(c)) && !before.contains(String.valueOf(c))) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("dddccdbba"));
        System.out.println(solution.firstUniqChar("leetcode"));
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }
}

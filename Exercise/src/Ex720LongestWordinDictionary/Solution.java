package Ex720LongestWordinDictionary;

import java.util.*;

/**
 * Given a list of strings words representing an English Dictionary, find the longest word in words that can be built one character at a time by other words in words. If there is more than one possible answer, return the longest word with the smallest lexicographical order.
 * <p>
 * If there is no answer, return the empty string.
 * Example 1:
 * Input:
 * words = ["w","wo","wor","worl", "world"]
 * Output: "world"
 * Explanation:
 * The word "world" can be built one character at a time by "w", "wo", "wor", and "worl".
 * Example 2:
 * Input:
 * words = ["a", "banana", "app", "appl", "ap", "apply", "apple"]
 * Output: "apple"
 * Explanation:
 * Both "apply" and "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
 * Note:
 * <p>
 * All the strings in the input will only contain lowercase letters.
 * The length of words will be in the range [1, 1000].
 * The length of words[i] will be in the range [1, 30].
 */
public class Solution {
    public String longestWord(String[] words) {
        HashMap<String, Boolean> map = new HashMap<>();
        HashSet<String> result = new HashSet<>();
        for (String word : words) {
            map.put(word, true);
        }
        System.out.println(map);
        for (String word : words) {
            map.put(word, false);
            boolean flag = true;
            for (int i = 1; i < word.length(); i++) {
                String temp = word.substring(0, i);
                if (!map.containsKey(temp)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(word);
            }
        }
        System.out.println(result);
        for (String str1 : result) {
            boolean flag = true;
            for (String str2 : result) {
                if (str1.equals(str2))
                    continue;
                if (str2.length() == str1.length()) {
                    for (int i = 0; i < str1.length(); i++) {
                        if (str2.charAt(i) == str1.charAt(i)) {
                            continue;
                        } else if (str2.charAt(i) < str1.charAt(i)) {
                            flag = false;
                            break;
                        } else {
                            break;
                        }
                    }
                } else if (str2.length() > str1.length()) {
                    flag = false;
                }
            }
            if (flag)
                return str1;
        }
        return null;
    }

    public static void main(String[] arg) {
        Solution solution = new Solution();
        System.out.println(solution.longestWord(new String[]{"t", "ti", "tig", "tige", "tiger", "e", "en", "eng", "engl", "engli", "englis", "english", "h", "hi", "his", "hist", "histo", "histor", "history"}));
//        System.out.println(solution.longestWord(new String[]{"w", "wo", "wor", "worl", "world"}));
//        System.out.println(solution.longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"}));
    }
}

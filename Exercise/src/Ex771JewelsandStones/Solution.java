package Ex771JewelsandStones;

import java.util.HashMap;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0;
        for (Character c : J.toCharArray()) {
            map.put(c, 0);
        }
        for (Character c : S.toCharArray()) {
            if (map.containsKey(c)) {
                int value = map.get(c) + 1;
                map.put(c, value);
            }
        }
        for(Integer i: map.values()){
            result += i;
        }
        return result;
    }
}

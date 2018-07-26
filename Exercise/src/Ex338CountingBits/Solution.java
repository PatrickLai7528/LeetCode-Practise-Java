package Ex338CountingBits;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non negative integer number num. For every numbers i in the range 0 ≤ i ≤ num calculate the number of 1's in their binary representation and return them as an array.
 * <p>
 * Example:
 * For num = 5 you should return [0,1,1,2,1,2].
 * <p>
 * Follow up:
 * <p>
 * It is very easy to come up with a solution with run time O(n*sizeof(integer)). But can you do it in linear time O(n) /possibly in a single pass?
 * Space complexity should be O(n).
 * Can you do it like a boss? Do it without using any builtin function like __builtin_popcount in c++ or in any other language.
 * Credits:
 * Special thanks to @ syedee for adding this problem and creating all test cases.
 */
public class Solution {
    public int[] countBits(int num) {
        List<Integer> list = new ArrayList<>();
        int tempSum, tempInteger;
        for (int i = 0; i < num; i++) {
            tempSum = 0;
            tempInteger = i;
            while (tempInteger > 0) {
                tempSum += tempInteger & 1;
                tempInteger = tempInteger >> 1;
            }
            list.add(tempSum);
        }
        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }
}

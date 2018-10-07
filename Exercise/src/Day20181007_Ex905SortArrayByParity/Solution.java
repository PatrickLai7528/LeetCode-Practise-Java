package Day20181007_Ex905SortArrayByParity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
 * <p>
 * You may return any answer array that satisfies this condition.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */
public class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer i : A) {
            if (i % 2 == 0)
                list1.add(i);
            else
                list2.add(i);
        }
        for (int i = 0; i < list1.size(); i++) {
            A[i] = list1.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            A[i + list1.size()] = list2.get(i);
        }
        return A;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = solution.sortArrayByParity(new int[]{3, 1, 2, 4});
        for (Integer i : array) {
            System.out.println(i);
        }
    }
}

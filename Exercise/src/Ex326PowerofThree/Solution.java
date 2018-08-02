package Ex326PowerofThree;

/**
 * Given an integer, write a function to determine if it is a power of three.
 * <p>
 * Example 1:
 * <p>
 * Input: 27
 * Output: true
 * Example 2:
 * <p>
 * Input: 0
 * Output: false
 * Example 3:
 * <p>
 * Input: 9
 * Output: true
 * Example 4:
 * <p>
 * Input: 45
 * Output: false
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 1) {
            return true;
        } else if (n % 3 != 0 || n == 0) {
            return false;
        } else {
            return isPowerOfThree(n / 3);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfThree(16));
        System.out.println(solution.isPowerOfThree(9));
        System.out.println(solution.isPowerOfThree(81));
        System.out.println(solution.isPowerOfThree(17));
    }
}

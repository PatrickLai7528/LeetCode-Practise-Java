package Ex231PowerOfTwo;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        /*
         * 2 = 0010
         * 4 = 0100
         * 8 = 1000
         * 16 = 0001 0000
         * 32 = 0010 0000
         */
        int numberOfOne = 0;
        while (n > 0) {
            numberOfOne += (n & 1);
            n = n >> 1;
        }
        return numberOfOne == 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1));
        System.out.println(solution.isPowerOfTwo(2));
        System.out.println(solution.isPowerOfTwo(3));
        System.out.println(solution.isPowerOfTwo(5));
        System.out.println(solution.isPowerOfTwo(4));
        System.out.println(solution.isPowerOfTwo(6));
    }
}

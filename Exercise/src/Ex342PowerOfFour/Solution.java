package Ex342PowerOfFour;

/**
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.
 * <p>
 * Example:
 * Given num = 16, return true. Given num = 5, return false.
 * <p>
 * Follow up: Could you solve it without loops/recursion?
 * <p>
 * Credits:
 * Special thanks to @yukuairoy for adding this problem and creating all test cases.
 */
public class Solution {
    public boolean isPowerOfFour(int num) {
        /*
         * 4 = 0000 0100
         * 16 = 0001 0000
         * 64 = 0100 0000
         */
        int counterOfOne = 0;
        int counterOfPosition = 0;
        while (num > 0) {
            if ((num & 1) == 0b1) {
                counterOfOne++;
            } else {
                counterOfPosition++;
            }
            num >>= 1;
        }
        System.out.println(counterOfOne);
        System.out.println(counterOfPosition);
        return counterOfOne == 1 && counterOfPosition % 2 == 0;
    }

    public static void main(String[] strings) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(4));
        System.out.println(solution.isPowerOfFour(5));
        System.out.println(solution.isPowerOfFour(16));
    }
}

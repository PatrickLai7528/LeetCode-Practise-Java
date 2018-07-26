package Ex191NumbersOf1Bits;

/**
 * Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
 * <p>
 * Example 1:
 * <p>
 * Input: 11
 * Output: 3
 * Explanation: Integer 11 has binary representation 00000000000000000000000000001011
 * Example 2:
 * <p>
 * Input: 128
 * Output: 1
 * Explanation: Integer 128 has binary representation 00000000000000000000000010000000
 */
public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for(int i = 0 ; i < 32; i++) {
            if((n & mask) != 0 ){
                result++;
            }
            mask = mask << 1;
        }
        return result;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.hammingWeight(0b10000000000000000000000000000000));
    }
}

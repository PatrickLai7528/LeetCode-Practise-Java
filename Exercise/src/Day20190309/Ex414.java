package Day20190309;/*
 * @PackageName Day20190309
 * @ClassName Ex414
 * @Author Lai Kin Meng
 * @Date 2019-03-09
 * @ProjectName LeetCode-Practise
 */

public class Ex414 {
    public int thirdMax(int[] nums) {
        long one = -Long.MAX_VALUE;
        long two = -Long.MAX_VALUE;
        long three = -Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > one) {
                three = two;
                two = one;
                one = nums[i];
            } else if (nums[i] > two && nums[i] < one) {
                three = two;
                two = nums[i];
            } else if (nums[i] > three && nums[i] < two)
                three = nums[i];
        }
        if (three == -Long.MAX_VALUE) return (int) one;
        else return (int) three;
    }

    public static void main(String[] args){
        int [] nums = new int[]{1,12,2,7,3,4,66,5,6};
        System.out.println(new Ex414().thirdMax(nums));
    }
}

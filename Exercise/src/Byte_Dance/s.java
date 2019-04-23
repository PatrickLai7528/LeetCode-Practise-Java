package Byte_Dance;/*
 * @PackageName Byte_Dance
 * @ClassName s
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.Scanner;

public class s {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = 1024 - in.nextInt();
            int ret = 0;

            ret = a / 64;
            a = a - ret * 64;

            if (a >= 16) {
                int temp = a / 16;
                ret = ret + temp;
                a = a -temp  * 16;
            }

            if (a >= 4) {
                int temp = a / 4;
                ret = ret + temp;
                a = a - temp  * 4;
            }
            if (a >= 1)
                ret += a;
            System.out.println(ret);
        }
    }
}

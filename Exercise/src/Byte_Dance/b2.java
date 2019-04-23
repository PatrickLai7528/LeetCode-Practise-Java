package Byte_Dance;/*
 * @PackageName Byte_Dance
 * @ClassName b2
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.Scanner;

public class b2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int n = in.nextInt();
            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                strs[i] = in.next();
            }

            int correct = 0;
            while (correct != n) {
                for (int i = 0; i < strs.length; i++) {
                    boolean isFirst = correctFirst(strs, i);
                    boolean isSecond = correctSecond(strs, i);
                    if ((isFirst || isSecond))
                        correct++;
                }
            }
            for (int i = 0; i < n; i++)
                System.out.println(strs[i]);
        }
    }

    private static boolean correctFirst(String[] strs, int at) {
        String str = strs[at];
        if (str.length() <= 3) {
            if (str.length() == 3 && str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
                strs[at] = "" + str.charAt(0) + str.charAt(1);
                return true;
            } else
                return false;
        }


        StringBuffer sb = new StringBuffer();
        boolean isFirst = false;
        sb.append(str, 0, 2);
        for (int j = 2; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(j - 1) && str.charAt(j - 1) == str.charAt(j - 2)) {
                isFirst = true;
                //
            } else {
                sb.append(str.charAt(j));
            }
        }
        strs[at] = sb.toString();
        return isFirst;
    }

    private static boolean correctSecond(String[] strs, int at) {
        String str = strs[at];
        if (str.length() <= 4) {
            if (str.length() == 4 && str.charAt(0) == str.charAt(1) && str.charAt(2) == str.charAt(3)) {
                strs[at] = "" + str.charAt(0) + str.charAt(1) + str.charAt(2);
                return true;
            } else return false;
        }

        boolean isSecond = false;
        StringBuffer sb = new StringBuffer();
        sb.append(str, 0, 3);
        for (int j = 3; j < str.length(); j++) {
            if (str.charAt(j) == str.charAt(j - 1)    // BB
                    && str.charAt(j - 2) == str.charAt(j - 3) // AA
            ) {
                isSecond = true;
            } else {
                sb.append(str.charAt(j));
            }
        }
        strs[at] = sb.toString();
        return isSecond;
    }

}

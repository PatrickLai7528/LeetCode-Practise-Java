package Byte_Dance;/*
 * @PackageName Byte_Dance
 * @ClassName b
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.Scanner;

public class b {
    public static void main(String[] agrs) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {//注意while处理多个case
//            int n = in.nextInt();
//            String[] strs = new String[n];
//            for (int i = 0; i < n; i++) {
//                strs[i] = in.next();
////                System.out.println(strs[i]);
//            }
//
//            int corrected = 0;
//            while (corrected != n) {
//                for (int i = 0; i < n; i++) {
//                    // 檢查第一類
//                    String str = strs[i];
//                    StringBuffer sb = new StringBuffer();
//
//                    boolean isFirst = false;
//                    boolean isSecond = false;
//
//                    if (str.length() <= 2) {
//                        if (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
//                            sb.append(str, 0, 1);
//                            isFirst = true;
//                        } else {
//                            sb.append(str, 0, 2);
//                            for (int j = 2; j < str.length(); j++) {
//                                if (str.charAt(j) == str.charAt(j - 1) && str.charAt(j - 1) == str.charAt(j - 2)) {
//                                    isFirst = true;
//                                } else {
//                                    sb.append(str.charAt(j));
//                                }
//                            }
//                        }
//                    }
//
//                    if (isFirst) {
//                        strs[i] = sb.toString();
//                        corrected++;
//                        continue;
//                    }
//
//                    sb = new StringBuffer();
//
//                    sb.append(str, 0, 3);
//                    for (int j = 3; j < str.length(); j++) {
//                        if (str.charAt(j) == str.charAt(j - 1)    // BB
//                                && str.charAt(j - 2) == str.charAt(j - 3) // AA
//                        ) {
//                            isSecond = true;
//                            continue;
//                        } else {
//                            sb.append(str.charAt(j));
//                        }
//                    }
//                    if (isSecond) {
//                        corrected++;
//                        strs[i] = sb.toString();
//                    }
//                }
//            }
//            for (int i = 0; i < n; i++)
//                System.out.println(strs[i]);
//        }
    }
}

package Tecent;/*
 * @PackageName Tecent
 * @ClassName Q2
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                String line = in.next();
                if (!canIWin(line)) {
                    System.out.println("Oh,no.");
                } else {
                    System.out.println("Yes,you can win!");
                }
            }
        }
    }

    private static boolean canIWin(String str) {
        int round = 0;
        String temp = str;
        while (true) {
            String removed = removeOneDuplicate(temp); // 從str裡刪除一個重覆元素
            if (removed.equals(str)) { // 刪了跟沒刪一樣 ＝> 沒有重覆
                return round % 2 == 0;
            }
            temp = removed;
            round++;
        }
    }

    private static String removeOneDuplicate(String str) {
        StringBuffer sb = new StringBuffer();
        boolean ok = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (!ok && str.charAt(i) == str.charAt(i + 1)) {
                ok = true;
                i++;
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }
        sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }
}

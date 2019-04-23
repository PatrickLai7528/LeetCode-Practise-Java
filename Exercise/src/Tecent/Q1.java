package Tecent;/*
 * @PackageName Tecent
 * @ClassName Q1
 * @Author Lai Kin Meng
 * @Date
 * @ProjectName LeetCode-Practise
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        String [] ret = new String[T];
        int curr;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            Set<Integer> set = new HashSet<>();
            curr = N;
            for (int j = 0; j < N; j++) {
                int next = in.nextInt();
                if (next == curr) {
                    sb.append(next);
                    while (next != 0 && (set.contains(next - 1))) {
                        sb.append(" ").append(next - 1);
                        set.remove(next - 1);
                        next--;
                    }
                    if (j != N - 1) sb.append("\n");

                    curr = next - 1;
                } else {
                    set.add(next);
                    sb.append("\n");
                }
            }
            ret[i] = sb.toString();
        }
        for(String str: ret){
            System.out.println(str);
        }
    }
}

package Day20190309;/*
 * @PackageName Day20190309
 * @ClassName Ex539
 * @Author Lai Kin Meng
 * @Date 2019-03-09
 * @ProjectName LeetCode-Practise
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex539 {
    public int findMinDifference(List<String> timePoints) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String p1: timePoints){
            for(String p2: timePoints){
                if(p1.equals(p2))
                    continue;

                String f = p1 + "->" + p2;
                String b = p2 + "->" + p1;
                if(!map.containsKey(f)){
                    map.put(f, diff(p1, p2));
                }
                if(!map.containsKey(b)){
                    map.put(b, diff(p2, p1));
                }
            }
        }

        System.out.println(map);

        int min = Integer.MAX_VALUE;

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() < min){
                min = entry.getValue();
            }
        }

        return min;
    }

    private int diff(String s1, String s2){
        String h1 = s1.split(":")[0];
        String h2 = s2.split(":")[0];

        String m1 = s1.split(":")[1];
        String m2 = s2.split(":")[1];

        if(h1.equals("00"))
            h1 = "24";
        if(h2.equals("00"))
            h2 = "24";
//        if(m1.equals("00"))
//            m1 = "60";
//        if(m2.equals("00"))
//            m2 = "60";
        // System.out.println(s1);
        // System.out.println(h1 + ":"+ m1);
        // System.out.println("*******************");
        // System.out.println(s2);
        // System.out.println(h2 + ":" + m2);

        int ih1 = Integer.parseInt(h1);
        int ih2 = Integer.parseInt(h2);
        int im1 = Integer.parseInt(m1);
        int im2 = Integer.parseInt(m2);



        return Math.abs(( ih1 * 60 + im1 ) - ( ih2 * 60 + im2 ));
    }

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("23:59");
        list.add("00:00");
        Ex539 ex = new Ex539();
        System.out.println(ex.findMinDifference(list));
    }
}

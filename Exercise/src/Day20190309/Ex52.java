package Day20190309;/*
 * @PackageName Day20190309
 * @ClassName Ex52
 * @Author Lai Kin Meng
 * @Date 2019-03-09
 * @ProjectName LeetCode-Practise
 */

public class Ex52 {
    private int result = 0;
    public int totalNQueens(int n) {
        boolean [][] bitMap = new boolean[n][n];
        boolean [][] visited = new boolean[n][n];
        // System.out.println(bitMap);
        // for(int i = 0; i < bitMap.length; i++){
        //     for(int j = 0; j < bitMap[i].length; j++){
        //         System.out.print(bitMap[i][j]+" ");
        //     }
        //     System.out.println("");
        // }
        backtrace(bitMap, visited);
        return 0;
    }

    private void queenOn(boolean [][] bitMap, int i, int j, boolean dead){
        for(int k = 0; k < bitMap.length; k++){
            bitMap[i][k] = dead;
            bitMap[k][j] = dead;
            if(i + k < bitMap.length && j + k < bitMap[i].length)
                bitMap[i+k][j+k] = dead;
        }
    }

    private void backtrace(boolean [][] bitMap, boolean [][] visted){
        for(int i = 0; i < bitMap.length; i++){
            for(int j = 0; j < bitMap[i].length; j++){
                if(!bitMap[i][j]){
                    visted[i][j] = true;

                    queenOn(bitMap, i, j, false);
                }

                // check if dead
                if(i == bitMap.length-1 && j == bitMap[i].length - 1){
                    queenOn(bitMap, i , j , true);
                }
            }


            for(int q = 0; q < bitMap.length; q++){
                for(int w = 0; w< bitMap[q].length; w++){
                    System.out.print(bitMap[q][w]+" ");
                }
                System.out.println("");
            }
        }
    }

    public static void main(String[] args){
        System.out.println(new Ex52().totalNQueens(4));
    }
}

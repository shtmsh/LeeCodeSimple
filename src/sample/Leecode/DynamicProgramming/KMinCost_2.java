package sample.Leecode.DynamicProgramming;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 14:41 2019/12/3
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * KMinCost的优化版本：
 * 在第i-1号房子的最小值是同事取出它的最小值和次小值，
 * 在选取第i个房子的颜色的时候，我们看当前颜色的最小值是不是和最小值的颜色相同：
 * 不同，直接相加，得到最小值。相同，就加上次小值。
 */
public class KMinCost_2 {

    public static int kMinCost_2(int[][] cost) {
        if (cost.length == 0 || cost[0].length == 0) {
            return 0;
        }
        int n = cost.length;
        int k = cost[0].length;

        int[][] result = new int[n][k];

        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }
        //初始值
        for (int i = 0; i < k; i++) {
            result[0][i] = cost[0][i];
        }

        for (int i = 1; i < n; i++) {

            int min1 = Integer.MAX_VALUE;//最小值
            int min2 = Integer.MAX_VALUE;//次小值
            int index = -1;//索引

            for (int j = 0; j < k; j++) {
                if (result[i - 1][j] < min1) {//如果当前值比最小还要小
                    min2 = min1;//原来的最小值升级为次小值
                    min1 = result[i - 1][j];//当前值变为最小值
                    index = j;//记录索引值
                } else if (result[i - 1][j] < min2) {//如果单前值大于最小值，但是小于次小值
                    min2 = result[i - 1][j];//将当前值保存为次小值
                }
            }

            for (int l = 0; l < k; l++) {
                //如果当前选择的颜色和第n-1个颜色不相同，就直接相加上
                if (index != l) {
                    result[i][l] = Math.min(result[i][l], min1 + cost[i][l]);
                } else {
                    //如果相同，则加上次小值
                    result[i][l] = Math.min(result[i][l], min2 + cost[i][l]);
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            res = Math.min(res, result[n - 1][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] cost = {{1, 5, 3}, {2, 9, 4}};
        System.out.println(KMinCost_2.kMinCost_2(cost));
    }
}

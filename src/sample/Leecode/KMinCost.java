package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 13:37 2019/12/3
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 刷房子的升级版：
 * 假入有一排房子，共n个，可以被刷成k种颜色的其中一种。
 * 你需要粉刷所有的房子，并且使其相邻的房子颜色不同
 * 房子的花费用一个n*k的矩阵来表示：cost[n][k]，表示粉刷第n号房子的颜色为k时的花费
 */

public class KMinCost {
    public static int kMinCost(int[][] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int n = cost.length;
        int k = cost[0].length;

        int[][] result = new int[n][k];//表示将第n号房子粉刷为k颜色时的花费
        //填充result初始值为最大值
        for (int i = 0; i < n; i++) {
            Arrays.fill(result[i], Integer.MAX_VALUE);
        }
        //初始化第0号房子的花费
        for (int i = 0; i < k; i++) {
            result[0][i] = cost[0][i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < k; l++) {
                    if (j != l) {
                        //第i号房子用l颜色粉刷
                        //第i号房子用l颜色粉刷的最小花费为：第i-1个房子用j颜色粉刷，第i个房子用j颜色粉刷的最小值
                        result[i][l] = Math.min(result[i][l], result[i - 1][j] + cost[i][l]);
                    }
                }
            }
        }

        int res = Integer.MAX_VALUE;
        for (int i = 1; i < k; i++) {
            res = Math.min(res, result[n - 1][i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] cost = {{1, 5, 3}, {2, 9, 4}};
        System.out.println(KMinCost.kMinCost(cost));
    }
}

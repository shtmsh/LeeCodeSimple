package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 10:31 2019/12/3
 * @MOdified By:
 */

/**
 * 加入有一排房子，每个房子可以被粉刷成红色，蓝色或者绿色这三种颜色中的一种，
 * 你需要粉刷所有的房子，并且使相邻两个房子的颜色不能相同，请你计算怎么粉刷所有房子，使成本最小。
 * <p>
 * 由于不同颜色油漆的价格不同，每个房子粉刷成不同颜色的花费是以一个n*3的矩阵来表示的
 * 例如：cost[0][0]表示，第0号房子粉刷成红色的分本费，const[0][1]表示：第0号房子粉刷成蓝色的成本费
 * cost[0][2]表示，第0号房子粉刷成绿色的成本费
 * <p>
 * 示例：
 * 输入：
 * [[17,2,17],[16,16,5],[14,3,19]]
 * 输出：10
 * 最少花费为 ：2+5+3 = 10
 */
public class MinCost {
    public static int minCost(int[][] cost) {
        if (cost == null || cost.length == 0) {
            return 0;
        }

        int n = cost.length;

        int[][] result = new int[n][3];//result[i][j]，表示第i个房子选择第j种颜色

        for (int i = 0; i < 3; i++) {
            result[0][i] = cost[0][i];
        }

        for (int i = 1; i < n; i++) {
            result[i][0] = Math.min(result[i - 1][1], result[i - 1][2]) + cost[i][0];
            result[i][1] = Math.min(result[i - 1][0], result[i - 1][2]) + cost[i][1];
            result[i][2] = Math.min(result[i - 1][0], result[i - 1][1]) + cost[i][2];
        }

        return Math.min(result[n - 1][0], Math.min(result[n - 1][1], result[n - 1][2]));
    }

    public static void main(String[] args) {
        int[][] cost = {{17, 2, 17}, {16, 16, 5}, {14, 3, 19}};

        System.out.println(MinCost.minCost(cost));
    }

}

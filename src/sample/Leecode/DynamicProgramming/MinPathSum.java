package sample.Leecode.DynamicProgramming;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 11:04 2019/11/29
 * @MOdified By:
 */

/**
 * 给定一个包含非负整数的m*n的网格，请找出从一条从左上角到右下角的路径，使得路径上的
 * 数字总和最小
 * 说明：每次只能向右或者向下移动一格
 * 示例：
 * 输入[
 * [1,3,1],
 * [1,5,1],
 * [4,2,1]
 * ]
 * 输出：7   （1 + 3 + 1 + 1 + 1）
 */
public class MinPathSum {
    public static int minPathSum(int[][] grid) {
       
        int m = grid.length;
        int n = grid[0].length;

        int[][] result = new int[m][n];
        result[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            result[i][0] = result[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            result[0][i] = result[0][i - 1] + grid[0][i];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + grid[i][j];
            }
        }
        return result[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(MinPathSum.minPathSum(grid));
    }
}

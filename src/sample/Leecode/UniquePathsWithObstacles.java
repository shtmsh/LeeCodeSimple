package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 17:03 2019/11/28
 * @MOdified By:
 */

/**
 * 一个机器人位于m*n的网格上，机器人每次只能向下或者向右移动，机器人从网格的左上角移动到右下角，
 * 现在考虑有障碍物，那么从左上角到右下角一共有多少条不同的路径？
 * 说明：m和n不超过100。
 * <p>
 * 示例：
 * 输入：
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0]
 * ]
 * 输出：2
 */
public class UniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] result = new int[m][n];
        //初始化初始值
        result[0][0] = 1;
        for (int i = 1; i < n; i++) {
            //第一行的值，就是等于向右 + 向下 此时向下的为0，下面同理
            result[0][i] = obstacleGrid[0][i] == 1 ? 0 : result[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            result[i][0] = obstacleGrid[i][0] == 1 ? 0 : result[i - 1][0];
        }
        //如果obstacleGrid为 1 ,则到当前位置的所有路径为0
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = obstacleGrid[i][j] == 1 ? 0 : result[i - 1][j] + result[i][j - 1];
            }
        }

        return result[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}};

        System.out.println(UniquePathsWithObstacles.uniquePathsWithObstacles(obstacleGrid));
    }
}

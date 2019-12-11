package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 16:36 2019/11/28
 * @MOdified By:
 */

/**
 * 一个机器人位于一个m*n网格左上角(图中是start位置)，机器人每次只能向下或者向右移动一步。
 * 机器人试图达到网格的右下角（图中的finish位置），问总共有多少种路径？
 * <p>
 * ++++++++++++++++++++++++++++++++++++++++++++++
 * +start +     +       +       +       +      +
 * ++++++++++++++++++++++++++++++++++++++++++++++
 * +     +     +       +       +       +       +
 * ++++++++++++++++++++++++++++++++++++++++++++++
 * +     +     +       +       +       + finish+
 * ++++++++++++++++++++++++++++++++++++++++++++++
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] result = new int[m][n];
        //初始化初始值
        result[0][0] = 1;
        for (int i = 1; i < n; i++) {
            result[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            result[i][0] = 1;
        }
        //转化方程
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                result[i][j] = result[i - 1][j] + result[i][j - 1];
            }
        }
        return result[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(UniquePaths.uniquePaths(3, 3));
        System.out.println(UniquePaths.uniquePaths(2, 2));
        System.out.println(UniquePaths.uniquePaths(2, 2));
    }

}

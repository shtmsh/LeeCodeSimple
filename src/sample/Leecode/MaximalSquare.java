package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 11:26 2019/11/29
 * @MOdified By:
 */

/**
 * 在一个由0和1组成的二维矩阵内，找到只包含1的最大正方形，并返回其面积
 * <p>
 * 示例：
 * <p>
 * 输入：
 * 1 0 1 0 0
 * 1 0 1 1 1
 * 1 1 1 1 1
 * 1 0 0 1 0
 * <p>
 * 输出：4
 */
public class MaximalSquare {
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] result = new int[m][n];//以 mn 为正方形右下角顶点的正方形的最大边长

        int maxlength = 0;//正方形的最大边长

        //初始化第一列第一行的值
        for (int i = 0; i < m; i++) {
            result[i][0] = matrix[i][0] == '1' ? 1 : 0;
            maxlength = Math.max(result[i][0], maxlength);
        }

        for (int i = 0; i < n; i++) {
            result[0][i] = matrix[0][i] == '1' ? 1 : 0;
            maxlength = Math.max(result[0][i], maxlength);
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                //最大边长分别为向左，向上，向左上边长的最小值加上当前点的边长1
                if (matrix[i][j] == '1') {
                    result[i][j] = Math.min(result[i - 1][j], Math.min(result[i][j - 1], result[i - 1][j - 1])) + 1;
                } else {
                    result[i][j] = 0;
                }

                maxlength = Math.max(result[i][j], maxlength);
            }
        }

        return maxlength * maxlength;
    }

    public static void main(String[] args) {
        //char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        char[][] matrix = {{'0', '1'}};
        System.out.println(MaximalSquare.maximalSquare(matrix));
    }
}


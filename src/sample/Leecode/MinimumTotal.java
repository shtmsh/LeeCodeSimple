package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 11:23 2019/11/28
 * @MOdified By:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定三角形，找出自顶向下的最小路径和，每一步只能移动到下一行中相邻的节点上
 * 例如：
 * [
 * [2],
 * [3,4],
 * [6,5,7],
 * [4,1,8,3]
 * ]
 * 自定向下的最小路径和为 2+3+5+1 = 11
 */


public class MinimumTotal {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[n][n];

        //初始化初始值
        List<Integer> lastRow = triangle.get(n - 1);
        for (int i = 0; i < n; ++i) {
            dp[n - 1][i] = lastRow.get(i);
        }
        //从下往上计算
        for (int i = n - 2; i >= 0; --i) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < i + 1; ++j) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + row.get(j);
                System.out.print("dp[" + i + "]" + "[" + j + "]=" + Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + " + " + row.get(j) + "    ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[0][0];
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(1);
        l1.add(2);
        List<Integer> l2 = new ArrayList<>(2);
        l2.add(3);
        l2.add(4);
        List<Integer> l3 = new ArrayList<>(3);
        l3.add(6);
        l3.add(5);
        l3.add(7);
        List<Integer> l4 = new ArrayList<>(4);
        l4.add(4);
        l4.add(1);
        l4.add(8);
        l4.add(3);
        List<List<Integer>> triangle = new ArrayList<>(4);
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);

        System.out.println(Arrays.toString(triangle.toArray()));

        System.out.println(MinimumTotal.minimumTotal(triangle));
    }
}

package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 16:23 2019/12/3
 * @MOdified By:
 */

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间屋内都藏有一定的现金，影响你偷窃的唯一制约因素就是
 * 相邻房屋在同一个晚上被小偷闯入，系统会自动报警
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够盗窃到的最高金额
 * 示例1：
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释： 1 + 3 = 4
 * <p>
 * 示例2:
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：2 + 9 + 1 = 12
 */

public class Rob {
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;

        int[] result = new int[n + 1];//result[i]表示，选择第i个房子的所能得到最大值

        result[0] = 0;//一个房子都不抢
        result[1] = nums[0];//抢最左边房子的最大值

        for (int i = 2; i <= n; i++) {
            //抢第i个房子获得的最大值为：如果抢第i个房子，第i-2个房子的最大值加上第i个房子
            //如果不抢，则为第i-1个房子的最大值。
            result[i] = Math.max(result[i - 2] + nums[i - 1], result[i - 1]);
        }

        return result[n];

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(Rob.rob(nums));
    }
}

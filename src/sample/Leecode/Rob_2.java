package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 10:33 2019/12/4
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋，每间屋子都藏有有一定的现金。这些房屋都围成一圈，
 * 同时相邻的房屋装有相互联通的防盗系统。
 * 给定一个代表房屋存放现金的非父整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额
 * <p>
 * 示例1：
 * 输入：[2,3,2]
 * 输出：3
 * 示例2：
 * 输入：[1,2,3,1]
 * 输出：4
 * <p>
 * 思路：将房子分为[0,n-2]和[1,n-1],来求出二者之间的最大值即可
 */
public class Rob_2 {

    public static int rob_2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int n = nums.length;

        return Math.max(
                Rob.rob(Arrays.copyOfRange(nums, 0, n - 1)),
                Rob.rob(Arrays.copyOfRange(nums, 1, n)));
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(Rob_2.rob_2(nums));

        System.out.println(Rob_2.rob_2(nums1));
    }
}

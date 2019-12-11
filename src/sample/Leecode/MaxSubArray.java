package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 14:58 2019/11/28
 * @MOdified By:
 */

/**
 * 给定一个整数数组nums,找到一个具有最大和的连续子数组（子数组中至少包含一个元素），返回其最大和
 * 示例：
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = Math.max(result[i - 1] + nums[i], nums[i]);
        }
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            max = max > result[i] ? max : result[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(MaxSubArray.maxSubArray(nums));
    }
}


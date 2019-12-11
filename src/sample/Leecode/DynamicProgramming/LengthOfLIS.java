package sample.Leecode.DynamicProgramming;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 15:28 2019/11/29
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 给定一个无序的整数数组，找出其中最长上升子序列的长度
 * 示例：
 * 输入：[10,9,2,5,3,7,101,18]
 * 输出：4
 * 最长上升子序列是[2，3，7，101] ，它的长度是4
 */
public class LengthOfLIS {
    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = 0;
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    result[i] = Math.max(result[j] + 1, result[i]);
                }
            }
            max = Math.max(max, result[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(LengthOfLIS.lengthOfLIS(nums));
    }

}

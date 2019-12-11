package sample.Leecode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 11:33 2019/10/16
 * @MOdified By:
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
 */
public class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solutioin");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] twosum = new Twosum().twoSum(nums, 9);
        System.out.println(Arrays.toString(twosum));
    }
}



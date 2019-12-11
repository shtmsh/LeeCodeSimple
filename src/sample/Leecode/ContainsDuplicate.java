package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 13:52 2019/10/22
 * @MOdified By:
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 */

public class ContainsDuplicate {
    /**
     * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 0){
                return true;
            }

        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums){
        Set<Integer> set = new HashSet<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(ContainsDuplicate.containsDuplicate(nums));
    }
}

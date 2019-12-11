package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 15:17 2019/10/18
 * @MOdified By:
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列(序列无序)，找出 0 .. n 中没有出现在序列中的那个数。
 */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length + 1; i++) {
            list.add(i);
        }

        for (int num : nums) {
            list.remove((Integer) num);
        }
        return list.getFirst();

    }

    public static int missingNumber1(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 异或运算，相同的两个数异或为0，异或符合结合律
     * eg. 0^(1^1)^(2^2)^(3^3)^(4^4) = 0
     *
     * @param nums
     * @return
     */
    public static int missingNumber3(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }

    public static int missingNumber4(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 1; i < nums.length + 1; i++) {
            sum += i;
            sum1 += nums[i - 1];
        }
        return sum - sum1;
    }

    public static int missingNumber5(int[] nums) {
        int sum = nums.length * (nums.length + 1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum - nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {0, 6, 4, 2, 3, 5, 7, 8, 1};
        System.out.println(missingNumber5(nums));
    }
}

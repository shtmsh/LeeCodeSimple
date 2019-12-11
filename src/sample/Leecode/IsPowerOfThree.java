package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 10:52 2019/10/18
 * @MOdified By:
 */

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 */
public class IsPowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        if (n % 3 == 0) {
            n = n / 3;
            return n == 3 || isPowerOfThree(n);
        } else {
            return false;
        }
    }

    public static boolean isPowerOfThree1(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static boolean isPowerOfThree2(int n) {
        return Integer.toString(n ,3).matches("^10*");
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree2(1));
        System.out.println(isPowerOfThree2(3));
        System.out.println(isPowerOfThree2(27));
        System.out.println(isPowerOfThree2(9));
        System.out.println(isPowerOfThree2(45));

    }
}

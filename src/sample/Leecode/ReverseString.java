package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 13:56 2019/10/17
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1;
//        int mid = s.length >>> 1;

        char temp;
        while (low < high) {
            temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }

    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l'};
        ReverseString.reverseString(s);
        System.out.println(Arrays.toString(s));

        char[] s1 = {'H', 'a', 'n', 'n','a','h'};
        ReverseString.reverseString(s1);
        System.out.println(Arrays.toString(s1));
    }
}

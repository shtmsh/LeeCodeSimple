package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 19:43 2019/10/20
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sCharArray = s.toCharArray();
        char[] tCharsArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharsArray);

        return Arrays.equals(sCharArray, tCharsArray);
    }

    public static void main(String[] args) {
        System.out.println(IsAnagram.isAnagram("anagram", "angaram"));
        int j = 9 , left = 8;
        if (j-- == left){
            System.out.println(j);
        }
        System.out.println(j);
    }
}

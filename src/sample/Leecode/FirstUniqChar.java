package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 10:33 2019/10/17
 * @MOdified By:
 */


import java.util.*;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstUniqChar.firstUniqChar("leetcode"));
        System.out.println(FirstUniqChar.firstUniqChar("loveleetcode"));
    }
}

package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 13:51 2019/10/16
 * @MOdified By:
 * 输出从 1 到 n 数字的字符串表示。
 **/

import java.util.*;

/**
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);

        for (int i = 1; i < n + 1; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }

    /*字符串拼接，更加优雅和拓展*/
    public List<String> bestFizzBuzz(int n) {
        List<String> ans = new ArrayList<>(n);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "Fizz");
        map.put(5, "Buzz");

        for (int i = 1; i < n + 1; i++) {
            String s = "";
            for (Integer key : map.keySet()) {
                if (i % key == 0) {
                    s += map.get(key);
                }
            }

            if (s.equals("")) {
                ans.add(Integer.toString(i));
            } else {
                ans.add(s);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> list = new FizzBuzz().fizzBuzz(15);
        System.out.println(Arrays.toString(list.toArray()));

        List<String> list1 = new FizzBuzz().bestFizzBuzz(15);
        System.out.println(Arrays.toString(list1.toArray()));
    }
}

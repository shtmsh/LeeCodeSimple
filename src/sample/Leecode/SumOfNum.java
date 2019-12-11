package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 13:50 2019/9/20
 * @MOdified By:
 */


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 输入两个整数n和sum，从数列1，2，3 ... ... n中随意取几个数，使其和等于sum，要求将其中所有的组合列出来
 */


public class SumOfNum {

    public static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void sumOfNum(int sum, int n) {
        //退出条件
        if (sum <= 0 || n <= 0) {
            return;
        }

        if (sum == n) {
            Collections.reverse(linkedList);

            Iterator<Integer> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " + ");
            }

            System.out.println(n);
            Collections.reverse(linkedList);
        }


        linkedList.addFirst(n);

        sumOfNum(sum - n, n - 1);

        linkedList.removeFirst();

        sumOfNum(sum, n - 1);
    }


    public static void sum(int sum, int n) {
        int SUM = 0;
        int count = n;
        Stack<Integer> sumStack = new Stack<>();
        while (n > 0) {
//            if (n == 1 && SUM !=sum){
//                sumStack.clear();
//                SUM = 0;
//                n -- ;
//            }
            sumStack.push(n);

            SUM += n;
            n--;

            if (SUM > sum) {
                int p = sumStack.pop();
                SUM -= p;
            }

            if (SUM == sum) {
                for (Integer aSumStack : sumStack) {
                    System.out.print(aSumStack + " ");
                }
                System.out.println();

                SUM -= sumStack.pop();

                n = sumStack.pop();
                SUM -= n;
                n--;
            }

            if (sumStack.empty()){
                n -- ;
            }
        }
    }


    public static void main(String[] args) {

//        sumOfNum(20, 10);
        sum(20, 10);
    }
}

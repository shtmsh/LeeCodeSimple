package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 14:18 2019/10/22
 * @MOdified By:
 */

import java.util.Arrays;

/**
 * 统计所有小于非负整数 n 的质数的数量
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (isPrime1(i)) {
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 3) {
            return n > 1;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime1(int n) {
        if (n <= 3) {
            return n > 1;
        }

        if (n % 6 != 1 && n % 6 != 5) {
            return false;
        }

        for (int i = 5; i <= (int) Math.sqrt(n); i += 6) {
            if ((n % i == 0) || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int n) {
        boolean[] prime = new boolean[n];

        Arrays.fill(prime, true);


        for (int i = 2; i*i < n; i++) {
            if (isPrime1(i)) {
                for (int j = i * i; j < n; j = j + i){
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++){
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        CountPrimes.countPrimes(10);
        System.out.println(CountPrimes.countPrimes(10000));
    }
}

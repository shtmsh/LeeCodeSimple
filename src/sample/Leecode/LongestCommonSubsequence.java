package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 16:03 2019/12/4
 * @MOdified By:
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 * <p>
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 * <p>
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 * <p>
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 * <p>
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 */

/**
 * 给定两个字符串text1和text2,返回这两个字符串的最长公共子序列
 *
 * 示例1：
 * 输入：text1 = "abcde";  text2 = "ace"
 * 输出：3（最长公共子序列是"ace"）
 *
 * 示例2：
 * 输入：text1="abc"; text2="abc"
 * 输出：3
 *
 * 示例3：
 * 输入：text1="abc"; text2="def"
 * 输出：0
 */

/**
 * 表格分析法：
 *      a   c   e
 * a    1   1   1
 * b    1   1   1
 * c    1   2   2
 * d    1   2   2
 * e    1   2   3
 *
 * 从上述表格可以得出：
 * 两个字符串：str1 和 str2
 * 定义result[i][j]表示：字符串str1和str2取str1(0,...,i),str2(0,...,j)时的最长公共子序列的长度
 * (1) 当str1(i) = str2(j) 时：result[i][j] = max(result[i-i][j], result[i][j-1], result[i-1][j-1] + 1)
 * (2) 当str1(i) != str2(j) 时： result[i][j] = max(result[i-1][j], result[i][j-1])
 * 对于(1): result[i-1][j-1] + 1 >= result[i-1][j]  && result[i-1][j-1] + 1 >= result[i][j-1],
 * 所以对于(1),当str1(i) = str2(j) 时： result[i][j] = result[i-1][j-1] + 1
 *
 */

public class LongestCommonSubsequence {
    public static int longestCommonSubsquence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        if (m == 0 || n == 0) {
            return 0;
        }

        int[][] result = new int[m + 1][n + 1];

        char[] text1 = str1.toCharArray();
        char[] text2 = str2.toCharArray();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1[i - 1] == text2[j - 1]) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                } else {
                    result[i][j] = Math.max(result[i - 1][j], result[i][j - 1]);
                }
            }
        }

        return result[m][n];
    }

    public static void main(String[] args) {
        System.out.println(LongestCommonSubsequence.longestCommonSubsquence("abcde", "ace"));
    }
}

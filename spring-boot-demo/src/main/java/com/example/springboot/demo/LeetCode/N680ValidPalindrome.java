package com.example.springboot.demo.LeetCode;

public class N680ValidPalindrome {

    public static int isDeleted = 0;
    public static void main(String[] args) {

        /*String s = "aba";
        System.out.println(validPalindrome(s));

        String s2 = "abca";
        System.out.println(validPalindrome(s2));*/


        String s3 = "deeee";
//        System.out.println(validPalindrome(s3));

        String s4 = "eeccccbebaeeabebccceea";
//        System.out.println(validPalindrome(s4));

        String s5 = "ebcbbececabbacecbbcbe";
//        System.out.println(validPalindrome(s5));

        String s6 = "cbbcc";
        System.out.println(validPalindrome(s6));

    }

    /**
     * 给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串。
     *
     * 示例 1:
     * 输入: "aba"
     * 输出: True
     *
     * 示例 2:
     * 输入: "abca"
     * 输出: True
     *
     * 解释: 你可以删除c字符。
     * 注意:
     *
     * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
     * @param s
     * @return
     */
    public static boolean validPalindrome(String s) {
        char[] strs = s.toCharArray();
        int i,j;
//        ebcbb  ec ecabba ce c  bbcbe
//        deeee
//        eeccc c bebaeeabeb cccee a

        for (i = 0,j = strs.length -1; i <=j; i++,j--) {
            if (isDeleted <= 1){
                if (i==j ) return true;
                if (strs[i] == strs[j]) continue;
                else if (i+1 == j) return true;
                else if (strs[i] == strs[j-1] || strs[i+1] == strs[j]){
                    boolean isPal = false;
                    boolean isPal2 = false;
                    if (strs[i] == strs[j-1]){
                        //strs[i] == strs[j-1] 删掉strs[j-1]
                        String subStr = s.substring(i,j);
                        isDeleted++;
                        isPal = validPalindrome(subStr);
                    }
                    if (!isPal){
                        if (isDeleted <=1){
                            //isDeleted ==1 说明已经删过一次了但是左半边子字符串不是回文字符串
                            isDeleted = 0;
                            if (strs[i+1] == strs[j]){
                                //strs[i+1] == strs[j] 删掉strs[i]
                                String subStr2 = s.substring(i+1,j+1);
                                isDeleted++;
                                isPal2 = validPalindrome(subStr2);
                                return isPal2;
                            }
                        }else {
                            return false;
                        }
                    }
//                    return (isPal || isPal2);

                }
                else return false;
            }else {
                return false;
            }
        }
        return true;
    }
}

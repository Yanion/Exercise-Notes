package com.example.springboot.demo.LeetCode;

import org.springframework.util.StringUtils;


public class N1021RemoveOuterParentheses {

    public static void main(String[] args) {

        /**
         * ["MaxQueue","max_value","pop_front","max_value","push_back","max_value","pop_front","max_value","pop_front","push_back","pop_front","pop_front","pop_front","push_back","pop_front","max_value","pop_front","max_value","push_back","push_back","max_value","push_back","max_value","max_value","max_value","push_back","pop_front","max_value","push_back","max_value","max_value","max_value","pop_front","push_back","push_back","push_back","push_back","pop_front","pop_front","max_value","pop_front","pop_front","max_value","push_back","push_back","pop_front","push_back","push_back","push_back","push_back","pop_front","max_value","push_back","max_value","max_value","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","pop_front","max_value","max_value","max_value","push_back","pop_front","push_back","push_back","push_back","pop_front","max_value","pop_front","max_value","max_value","max_value","pop_front","push_back","pop_front","push_back","push_back","pop_front","pus...
         * [[],[],[],[],[46],[],[],[],[],[868],[],[],[],[525],[],[],[],[],[123],[646],[],[229],[],[],[],[871],[],[],[285],[],[],[],[],[45],[140],[837],[545],[],[],[],[],[],[],[561],[237],[],[633],[98],[806],[717],[],[],[186],[],[],[],[],[],[],[268],[],[29],[],[],[],[],[866],[],[239],[3],[850],[],[],[],[],[],[],[],[310],[],[674],[770],[],[525],[],[425],[],[],[720],[],[],[],[373],[411],[],[831],[],[765],[701],[]]
         */

        MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());


        /*MaxQueue maxQueue = new MaxQueue();
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        System.out.println(maxQueue.max_value());
        System.out.println(maxQueue.pop_front());
        System.out.println(maxQueue.max_value());*/



        /*MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());*/


        /*MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.push(-2147483648);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());*/



//        String s = "(()())(())";
//        System.out.println("result:"+removeOuterParentheses2(s));

        /***
         * CQueue
         */
        /*CQueue myQueue = new CQueue();
        System.out.println(myQueue.deleteHead());
        myQueue.appendTail(5);
        myQueue.appendTail(2);
        System.out.println(myQueue.deleteHead());
        System.out.println(myQueue.deleteHead());*/

    }

    /**有效括号字符串为空 ("")、"(" + A + ")" 或 A + B，其中 A 和 B 都是有效的括号字符串，+ 代表字符串的连接。
     * 例如，""，"()"，"(())()" 和 "(()(()))" 都是有效的括号字符串。

     如果有效字符串 S 非空，且不存在将其拆分为 S = A+B 的方法，我们称其为原语（primitive），其中 A 和 B 都是非空有效括号字符串。

     给出一个非空有效字符串 S，考虑将其进行原语化分解，使得：S = P_1 + P_2 + ... + P_k，其中 P_i 是有效括号字符串原语。

     对 S 进行原语化分解，删除分解中每个原语字符串的最外层括号，返回 S 。

      

     示例 1：

     输入："(()())(())"
     输出："()()()"
     解释：
     输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
     删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
     示例 2：

     输入："(()())(())(()(()))"
     输出："()()()()(())"
     解释：
     输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
     删除每个部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
     示例 3：

     输入："()()"
     输出：""
     解释：
     输入字符串为 "()()"，原语化分解得到 "()" + "()"，
     删除每个部分中的最外层括号后得到 "" + "" = ""。
      

     提示：

     S.length <= 10000
     S[i] 为 "(" 或 ")"
     S 是一个有效括号字符串

     来源：力扣（LeetCode）
     链接：https://leetcode-cn.com/problems/remove-outermost-parentheses
     著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。**/
    public static String removeOuterParentheses(String S) {
        if (StringUtils.isEmpty(S)){
            return "";
        }else {
            String result = "";
            int leftCount = 0;
            int rightCount = 0;
            String primTemp = "";
            for (int i = 0; i < S.length(); i++) {
                if (S.substring(i,i+1).equals(")")){
                    leftCount++;
                    primTemp += S.substring(i,i+1);
                }else{
                    rightCount++;
                    primTemp += S.substring(i,i+1);
                }
                if (leftCount == rightCount && leftCount != 0){
                    result = result + primTemp.substring(1,primTemp.length()-1);
                    leftCount = 0;
                    rightCount = 0;
                    primTemp = "";
                }
            }
            return result;
        }
    }
    public static String removeOuterParentheses2(String S) {
        if (StringUtils.isEmpty(S)){
            return "";
        }else {
            String result = "";
            int leftCount = 0;
            int rightCount = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.substring(i,i+1).equals("(")){
                    leftCount++;
                    if (leftCount != 1){
                        result += S.substring(i,i+1);
                    }
                }else{
                    rightCount++;
                    if (leftCount == rightCount && leftCount != 0){
                        leftCount = 0;
                        rightCount = 0;
                    }else {
                        result += S.substring(i,i+1);
                    }
                }
            }
            return result;
        }
    }
}

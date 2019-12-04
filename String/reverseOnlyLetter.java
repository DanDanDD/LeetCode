package String;

/**
 * @author: Dennis
 * @date: 2019/12/2 22:57
 */

/*
给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。

输入："ab-cd"
输出："dc-ba"

示例 2：
输入："a-bC-dEf-ghIj"
输出："j-Ih-gfE-dCba"

 */

class Solution {
    public static String reverseOnlyLetters(String S) {
        if(S.length() <= 1)return S;
        //左右指针
        int pL = 0; int pR = S.length() - 1;
        StringBuilder sb = new StringBuilder();
        //移动指针
        while(pL < S.length() && pR >= 0){
            //如果左端不是字符
            if(!isOkchar(S.charAt(pL))){
                sb.append(S.charAt(pL));
                pL++;
                //右端不是字符
            }else if(!isOkchar(S.charAt(pR))){
                pR--;
            }else{
                //都是字符
                sb.append(S.charAt(pR));
                pL++;
                pR--;
            }
        }
        //指针没到头的话
        sb.append(S.substring(pL,S.length()));
        return sb.toString();
    }
    public static boolean isOkchar(char c){
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }
}

class Solution2 {
    public static String reverseOnlyLetters(String S) {
        StringBuilder ans = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); ++i) {
            if (Character.isLetter(S.charAt(i))) {
                while (!Character.isLetter(S.charAt(j)))
                    j--;
                ans.append(S.charAt(j--));
            } else {
                ans.append(S.charAt(i));
            }
        }

        return ans.toString();
    }
}

public class reverseOnlyLetter {
    public static void main(String[] args) {
        String string = new String();
        string = "abc-cd";
        System.out.println(Solution.reverseOnlyLetters(string));
        System.out.println(Solution2.reverseOnlyLetters(string));

    }
}


package dynamicProgram.easy;

/**
 * @author: Dennis
 * @date: 2020/4/24 23:39
 */

/*
众所周知，牛妹非常喜欢吃蛋糕。
第一天牛妹吃掉蛋糕总数三分之一多一个，第二天又将剩下的蛋糕吃掉三分之一多一个，以后每天吃掉前一天剩下的三分之一多一个，到第n天准备吃的时候只剩下一个蛋糕。
牛妹想知道第一天开始吃的时候蛋糕一共有多少呢？

示例1
输入2
输出3

示例2
输入4
输出10

 */

public class Solution1_eatCake {
    // 方法1
//    public int cakeNumbers(int n){
//        if (n == 1){
//            return 1;
//        }
//        int res = 1;
//        for (int i = n-1; i < 0; i--) {
//            res = (res + 1) * 3/2;
//        }
//        return res;
//    }
    // 方法2 递归
    public int cakeNumbers(int n){
        int res = 0;
        if (n == 1){
            return 1;
        }
        res = (cakeNumbers(n-1) + 1) * 3/2;
        return res;
    }
}

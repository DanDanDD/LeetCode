package dynamicProgram.easy;

/**
 * @author: Dennis
 * @date: 2020/4/27 16:56
 */

public class Solution2_gift {
    public int selectPresent(int[][] presentVolumn){
        if (presentVolumn.length == 0){
            return 0;
        }
        int row = presentVolumn.length;
        int list = presentVolumn[0].length;
        int [][] dp = new int[row][list] ;
        dp[0][0] = presentVolumn[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < list; j++) {
                if (i == 0 && j != 0){
                    dp[i][j] = presentVolumn[i][j] + dp[i][j-1];
                }else if (i != 0 && j == 0){
                    dp[i][j] = presentVolumn[i][j] + dp[i-1][j];
                }else if (i != 0 && j != 0){
                    dp[i][j] = presentVolumn[i][j] + Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
            }

        }
        return dp[row-1][list-1];
    }
}

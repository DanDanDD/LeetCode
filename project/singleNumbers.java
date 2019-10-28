package D1;

import java.util.Arrays;

/**
 * @author: Dennis
 * @date: 2019/10/28 23:30
 */

/*
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
示例 :

输入: [2,2,1,3,4,3,4]
输出: 1

 */
public class singleNumbers {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i<nums.length -1;i++){
            if(nums[i] == nums[i+1]){
                i +=1;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length -1];
    }
}


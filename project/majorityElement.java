package D1;

import java.util.Arrays;

/**
 * @author: Dennis
 * @date: 2019/12/24 17:03
 */

public class majorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void majorityElement2(){

    }

    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4,5,5,5,5,5,1};
        majorityElement(nums);
    }
}

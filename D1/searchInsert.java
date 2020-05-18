package D1;

/**
 * @author: Dennis
 * @date: 2019/10/22 23:15
 */

/*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
你可以假设数组中无重复元素。
示例 1:
输入: [1,3,5,6], 5
输出: 2

示例 2:
输入: [1,3,5,6], 2
输出: 1

示例 4:
输入: [1,3,5,6], 0
输出: 0
 */

// 暴力带值法
public class searchInsert {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                System.out.println(i);
                break;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        searchInsert(new int[]{1, 2, 3, 4, 5}, 1);
    }
}

//二分查找法

//public class searchInsert{
//
//    public static int searchInsert(int nums[],int target){
//        int left = 0, right = nums.length - 1;
//        while(left <= right) {
//            int mid = (left + right) / 2;
//            if(nums[mid] == target) {
//                return mid;
//            } else if(nums[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        System.out.println(left);
//        return left;
//    }
//
//    public static void main(String[] args){
//        searchInsert(new int[]{1,3,5,7,9},4);
//
//    }
//}
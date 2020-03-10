package D1;

/**
 * @author: Dennis
 * @date: 2019/12/30 23:27
 */

public  class xuanzhuanshuzu {
    public static void rotate(int[] nums, int k) {
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
//旋转数组
    public static void rotate2(int[] nums,int k){
        k %= nums.length;
        for (int i = 0; i < k; i++){
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {
        int[] text = new int[]{1,2,3,4,5};
        rotate(text,2);
        rotate2(text,4);
    }
}

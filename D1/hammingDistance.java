package D1;

/**
 * @author: Dennis
 * @date: 2019/11/27 23:37
 */

public class hammingDistance {

    public static int hammingDistance(int x, int y) {
        /*int z = x ^ y;
        int sum = 0;
        while(z!=0){
            sum += z & 1;
            z = z>>1;
        }
        return sum;*/
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int distance = hammingDistance(4, 1);
        System.out.println(distance);
        int z = 4;
        System.out.println(4 & 1);
    }
}

package D1;

/**
 * @author: Dennis
 * @date: 2019/10/13 23:18
 */

public class HuiWenShu {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int help = 1;
        int tmp = x;
        while (tmp >= 10) {
            help *= 10;
            tmp /= 10;
        }
        while (x != 0) {
            if (x % 10 != x / help) {
                return false;
            }
            x = x % help / 10;
            help /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 12321;
        System.out.println(isPalindrome(x));
    }
}

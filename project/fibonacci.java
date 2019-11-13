package D1;



/**
 * @author: Dennis
 * @date: 2019/11/13 20:58
 */

class Fib{
    public static int fib(int N){
        if (N==1||N==0){
            return N;
        }
        return fib(N-1)+fib(N-2);
    }
}
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(Fib.fib(5));
    }
}

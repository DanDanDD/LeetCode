package String;

import java.util.Scanner;

/**
 * @author: Dennis
 * @date: 2019/12/1 10:22
 */

/*
字符串无冗余拼接
asd fgh
asdfgh
 */


// class Demo {
//    public static String func(String str){
//        String[] strs = str.split(" ");
//        String ret = "";
//        for(String s : strs){
//            ret += s ;
//        }
//        return ret;
//    }
// }

public class stringConnect {
//        public static void main(String[] args){
//            Scanner scanner = new Scanner(System.in);
//            String str = scanner.nextLine();
//            String ret = Demo.func(str);
//            System.out.println(ret);
//        }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String string = scaner.nextLine();
        System.out.println(string.replace(" ", ""));
    }
}


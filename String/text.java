package String;

import static java.lang.Character.isLetter;

/**
 * @author: Dennis
 * @date: 2019/12/7 17:54
 */

public class text {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("abc-efg");
        String string = new String("asdef");
        System.out.println(Character.isLetter(string.charAt(0)));
    }
}

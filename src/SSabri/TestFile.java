//Sabrun Sabri 09/20/18//
package SSabri;

import static SSabri.SSabriLib.*;

public class TestFile {
    public static void main(String[] args) {
        boolean a = isPalindrome("lol");
        System.out.println(a);

        String b = dateStr("12/10/2001");
        System.out.println(b);

        String c = cutOut("byehellohi","ehell");
        System.out.println(c);

        multiplicationTable(10,6);

        int d = sumUpTo(100);
        System.out.println(d);

    }
}

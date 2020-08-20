import java.util.Scanner;

public class BB1A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            rev.append(str.charAt(i));
        }
        System.out.println(str + rev);
    }
}

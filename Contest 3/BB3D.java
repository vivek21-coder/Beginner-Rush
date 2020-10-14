import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BB3D {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String a = scn.next();
        String b = scn.next();

        if (a.length() != b.length()) {
            System.out.println("NO");
            System.exit(0);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                list.add(i);
            }
        }

        if (list.size() == 2
                &&
                a.charAt(list.get(0)) == b.charAt(list.get(1))
                &&
                a.charAt(list.get(1)) == b.charAt(list.get(0))) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}

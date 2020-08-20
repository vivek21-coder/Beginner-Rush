import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BB1F {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] ans = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> rights = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int left = scn.nextInt();
            int right = scn.nextInt();
            map.put(left, right);
            rights.add(right);
        }
        for (int key : map.keySet()) {
            if (!rights.contains(key)) {
                ans[0] = key;
                break;
            }
        }
        ans[1] = map.get(0);
        for (int i = 2; i < n; i++) {
            ans[i] = map.get(ans[i - 2]);
        }

        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _2529부등호 {

    static int k;
    static boolean[] isChecked = new boolean[10];
    static char[] brackets;
    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        brackets = new char[k];

        for (int i = 0; i < k; i++) {
            brackets[i] = sc.next().charAt(0);
        }

        permutation("", 0);

        Collections.sort(res);
        System.out.println(res.get(res.size() - 1));
        System.out.println(res.get(0));
    }

    private static void permutation(String num, int cnt) {
        if (cnt == k + 1) {
            res.add(num);
            return;
        }

        for (int i = 0; i <= 9; i++) {
            if(isChecked[i]) continue;
            if (cnt == 0 || check(num.charAt(num.length() - 1) - '0', i, brackets[cnt - 1])) {
                isChecked[i] = true;
                permutation(num + i, cnt + 1);
                isChecked[i] = false;
            }
        }
    }

    private static boolean check(int a, int b, char c) {
        if (c == '<') return a < b;
        else return a > b;
    }
}
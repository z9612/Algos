import java.util.Scanner;

public class LCS {

    static String str1;
    static String str2;

    static int[][] dp;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        dp = new int[A.length()+1][B.length()+1];

        str1 = "0" + A;
        str2 = "0" + B;

        for (int i = 1; i <= A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        System.out.println(dp[str1.length()-1][str2.length()-1]);
    }

    private static void getString(int i, int j) {
        if (i == 0 || j == 0)
            return;
        if (str1.charAt(i) == str2.charAt(j)) {
            getString(i - 1, j - 1);
        }
        else {
            if (dp[i][j - 1] == dp[i][j])
                getString(i, j - 1);
            else
                getString(i - 1, j);
        }
    }
}
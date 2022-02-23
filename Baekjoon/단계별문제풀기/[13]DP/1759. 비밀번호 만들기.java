import java.util.Scanner;

public class 비밀번호_만들기 {

    static String str1;
    static String str2;

    static int[][] dp = new int[42][42];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

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

        getString(A.length(),B.length());
    }

    private static void getString(int i, int j) {
        if (i == 0 || j == 0)
            return;
        if (str1.charAt(i) == str2.charAt(j)) {
            getString(i - 1, j - 1);
            System.out.print( str1.charAt(i));
        }
        else {
            if (dp[i][j - 1] == dp[i][j])
                getString(i, j - 1);
            else
                getString(i - 1, j);
        }
    }


}
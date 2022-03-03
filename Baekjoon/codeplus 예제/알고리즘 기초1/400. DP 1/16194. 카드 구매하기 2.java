import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();//10
        int[] input = new int[N+1]; //1 1 2 3 5 8 13 21 34 55
        int[] dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            input[i] = sc.nextInt();
            dp[i] = input[i];
        }

        for (int i = 1; i <= N ; i++) {
            for (int j = 1; j <= i ; j++) {
                dp[i] = Math.min(dp[i],dp[i-j]+input[j]);
            }
        }

        System.out.println(dp[N]);
    }
}
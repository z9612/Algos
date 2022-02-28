import java.util.Arrays;
import java.util.Scanner;

//N이 주어졌을때 N번째 피보나치 수를 출력하자

public class Main {
    static long[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        dp = new long[91];
        Arrays.fill(dp,-1); //-1로 초기화
        dp[0] = 0;
        dp[1] = 1;

        long res = fibo(N);
        System.out.println(res);
    }

    //DP를 이용해서 재귀적으로 피보나치수를 구하기
    private static long fibo(int n) {
        //값이 없을 경우 재귀를 호출
        if(dp[n] == -1){
            dp[n] = fibo(n-1) + fibo(n-2);
        }

        //값이 있으면 메모이제이션의 값 그대로 출력
        return dp[n];
    }
}
import java.util.Scanner;

//참고자료 : https://dalconbox.tistory.com/71

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[][] dp = new int[1001][1001]; //각 인덱스에 해당하는 팩토리얼 값을 구함

        //파스칼의 삼각형 공식 nCr = n-1Cr-1 + n-1Cr;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
            }
        }

        System.out.println(dp[N][K]);
    }


}
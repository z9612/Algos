import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        //nCk 는 n! / (n-k)!*k! 이다
        //5C2 는 5 4 3 2 1 / 3 2 1 *  2 1 이다
        int res = solve(N, K);
        System.out.println(res);
    }

    private static int solve(int n, int k) {
        int A = getFactorial(n);
        int B = getFactorial(k);
        int C = getFactorial(n-k);

        return A / (B*C);
    }

    private static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        return n * getFactorial(n - 1);
    }
}
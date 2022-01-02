import java.util.Scanner;

public class 피보나치수5 {

    //첫째 줄에 n번째 피보나치 수를 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(getFibo(N));

    }

    private static int getFibo(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return getFibo(n - 1) + getFibo(n - 2);
    }
}

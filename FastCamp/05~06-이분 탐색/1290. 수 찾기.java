import java.util.Arrays;
import java.util.Scanner;

public class main2 {

    static Scanner sc = new Scanner(System.in);
    static int N, M;  //각각 A행렬과 B 행렬의 개수
    static int[] A, B;

    public static void main(String[] args) {
        input();
        solve();
    }

    public static void input() {
        M = sc.nextInt();
        A = new int[M];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        N = sc.nextInt();
        B = new int[N];

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
    }
    private static void solve() {
        //각각의 A행렬에 대해서 목표하는 B[i]를 가지고 있는지 체크
        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if (isExist(A, B[i], 0, M-1)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    //A 배열중에서 target인 B[i]가 있는지에 대해서 이분 탐색 진행
    private static boolean isExist(int[] arr, int target, int L, int R) {
        while (L <= R) {
            int M = (L + R) / 2;

            if (arr[M] < target) {
                L = M + 1;
            } else if (arr[M] > target) {
                R = M - 1;
            } else {
                return true;
            }
        }

        return false;
    }


}
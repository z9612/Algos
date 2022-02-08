import java.util.Arrays;
import java.util.Scanner;

public class ㅂㅈㄱ {

    static Scanner sc = new Scanner(System.in);

    static int res;
    static int numA, numB;
    static int[] arrA, arrB;

    static void input() {
        numA = sc.nextInt();
        numB = sc.nextInt();

        arrA = new int[numA];
        arrB = new int[numB];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {

        int TC = sc.nextInt();

        for (int tc = 0; tc < TC; tc++) {
            input();
            solve();

            System.out.println(res);
            res = 0;
        }
    }

    private static void solve() {
        //목표 배열인 arrB 배열을 정렬한다
        Arrays.sort(arrB);

        //arrA의 원소와 arrB의 원소를 비교
        for (int i = 0; i < arrA.length; i++) {

            // target인 arrA[i]를 찾기 위해 arrB[1...numB]를 이용함
            res += lower_bound(arrA[i], arrB, 1, numB);
        }
    }

    private static int lower_bound(int target, int[] arrB, int L, int R) {
        int res = L - 1; // 0

        while (L <= R) {
            int M = (L + R) / 2;
            if (arrB[M - 1] < target) {
                res = M;
                L = M + 1;
            } else {
                R = M - 1;
            }
        }
        return res;
    }
}
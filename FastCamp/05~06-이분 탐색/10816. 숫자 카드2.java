import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //10
        //6 3 2 10 10 10 -10 -10 7 3
        //8
        //10 9 -5 2 3 4 5 -10

        int N = sc.nextInt();
        int[] arrA = new int[N];

        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arrB = new int[M];

        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }


        int lowerBound = 0;
        int upperBound = 0;
        StringBuilder sb = new StringBuilder();
        //이분 탐색
        Arrays.sort(arrA);

        for (int i = 0; i < M; i++) {
            lowerBound = getLowerBound(arrA, 0, N, arrB[i]);
            upperBound = getUpperBound(arrA, 0, N, arrB[i]);
            sb.append(upperBound - lowerBound).append(' ');
        }

        System.out.println(sb.toString());

    }

    private static int getLowerBound(int[] arrA, int L, int R, int target) {
        while (L < R) {
            int M = (L + R) / 2;

            if (target <= arrA[M]) {
                R = M;
            } else {
                L = M + 1;
            }
        }

        return L;
    }

    private static int getUpperBound(int[] arrA, int L, int R, int target) {
        while (L < R) {
            int M = (L + R) / 2;

            if (target < arrA[M]) {
                R = M;
            } else {
                L = M + 1;
            }
        }

        return L;
    }
}
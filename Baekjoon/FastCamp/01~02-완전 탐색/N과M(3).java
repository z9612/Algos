import java.util.Scanner;

public class N과M_3 {

    static int N;
    static int M;
    static int[] arr;
    static int[] numbers;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); //1~N 까지의 수
        M = sc.nextInt(); //M개를 고름

        arr = new int[N];
        numbers = new int[M];
        sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        perm(0);
        System.out.println(sb.toString());
    }

    private static void perm(int cnt) {
        if (cnt == M) {

            for (int num: numbers) {
                sb.append(num +" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            numbers[cnt] = arr[i];
            perm(cnt + 1);
        }
    }
}



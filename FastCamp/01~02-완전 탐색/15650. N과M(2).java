import java.util.Scanner;

public class N과M {
    static int N;
    static int M;
    static int[] input;
    static int[] numbers;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        input = new int[N];
        numbers = new int[M];
        sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            input[i] = i + 1;
        }

        combination(0, 0);
        System.out.println(sb.toString());
    }

    private static void combination(int cnt, int start) {
        if (cnt == M) {
            for (int i : numbers) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            numbers[cnt] = input[i];
            combination(cnt + 1, i+1);
        }
    }
}



import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class _15663_ {

    static int N, M;
    static int[] inputs;
    static int[] numbers; //완성된 수열
    static boolean[] isChecked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //4 2
        //9 7 9 1

        N = sc.nextInt();
        M = sc.nextInt();
        inputs = new int[N];
        numbers = new int[M];
        isChecked = new boolean[N];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        Arrays.sort(inputs); //사전식 정렬을 위함

        permutation(0);

        set.forEach(System.out::println);

    }

    static LinkedHashSet<String> set = new LinkedHashSet<>(); //중복 제거를 위함

    private static void permutation(int cnt) {
        if (cnt == M) {
            StringBuilder sb = new StringBuilder();

            for (int el : numbers) {
                sb.append(el).append(" ");
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isChecked[i]) continue;

            isChecked[i] = true;
            numbers[cnt] = inputs[i];

            permutation(cnt + 1);
            isChecked[i] = false;
        }
    }
}
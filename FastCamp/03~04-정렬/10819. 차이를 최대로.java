import java.util.Scanner;

public class _10819_차이를_최대로 {

    static int N;
    static int[] inputs;
    static int[] numbers;
    static boolean[] isChecked;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        inputs = new int[N];
        numbers = new int[N];
        isChecked = new boolean[N];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        permutation(0);
        System.out.println(sum);
    }

    static int sum = 0;
    private static void permutation(int cnt) {
        if(cnt == N){
            int tempSum = 0;
            for (int i = 0; i < N-1; i++) {
                tempSum += Math.abs(numbers[i]-numbers[i+1]);
            }

            sum = Math.max(sum,tempSum);
            return;
        }

        for (int i = 0; i < N; i++) {
            if(isChecked[i]) continue;

            numbers[cnt] = inputs[i];
            isChecked[i] = true;
            permutation(cnt+1);
            isChecked[i] = false;
        }
    }
}
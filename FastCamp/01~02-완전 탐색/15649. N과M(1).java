import java.util.Scanner;

public class N과M {


    static int N;
    static int M;
    static int[] input;
    static int[] numbers;
    static boolean[] isChecked;
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        input = new int[N];
        numbers = new int[M];
        isChecked = new boolean[N];
        sb = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            input[i] = i+1;
        }

        permutation(0);
        System.out.println(sb.toString());
    }

    private static void permutation(int cnt) {
        if(cnt == M){
            for (int i: numbers) {
                sb.append(i + " ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < N; i++) {
            if(isChecked[i]) continue;

            isChecked[i]= true;
            numbers[cnt] = input[i];
            permutation(cnt+1);
            isChecked[i]= false;

        }
    }


}



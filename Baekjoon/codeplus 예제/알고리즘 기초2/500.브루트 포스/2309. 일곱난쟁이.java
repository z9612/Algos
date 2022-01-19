import java.util.Arrays;
import java.util.Scanner;

public class 일곱난쟁이 {
    static int[] hobbits;
    static int[] results;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hobbits = new int[9];
        results = new int[7];

        for (int i = 0; i < hobbits.length; i++) {
            hobbits[i] = sc.nextInt();
        }

        findResult(0, 0);

    }

    //중복이 없는 조합
    private static void findResult(int cnt, int start) {
        if (cnt == 7) {
            int sum = 0;

            //난쟁이들의 합이 100인 배열이 나오면 출력 후 종료
            for (int el : results) {
                sum += el;
            }

            if (sum == 100) {
                Arrays.sort(results);
                for (int el : results) {
                    System.out.println(el);
                }
            }
            return;
        }

        for (int i = start; i < hobbits.length; i++) {
            results[cnt] = hobbits[i];
            findResult(cnt + 1, i + 1);
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class _1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();
        int num = 1;

        int[] arr = new int[3];

        Arrays.fill(arr, 1);

        while (true) {
            if (arr[0] == E && arr[1] == S && arr[2] == M) {
                System.out.println(num);
                return;
            }

            arr[0]++;
            if (arr[0] > 15) arr[0] = 1;
            arr[1]++;
            if (arr[1] > 28) arr[1] = 1;
            arr[2]++;
            if (arr[2] > 19) arr[2] = 1;
            num++;
        }


    }
}

import java.util.Arrays;
import java.util.Scanner;

public class 카드 {
    static int N;
    static long[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        //5
        //1
        //2
        //1
        //2
        //2

        arr = new long[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr); //1 1 2 2 2

        int currentCount = 1; //현재 수의 등장 횟수
        int modeCount = 1;
        long mode = arr[0];

        for (int i = 1; i < N; i++) {
            if (mode == arr[i]) modeCount++;  //최빈수와 현재수가 같으면 최빈수 증가

            if (arr[i] == arr[i - 1]) {  //현재수와 이전수와 같다면 현재수 증가
                currentCount++;
            } else {                  //아니면 현재수 1로 초기화
                currentCount = 1;
            }

            //현재수가 최빈수를 넘으면 최빈수 빈도와 최빈수 갱신
            if (currentCount > modeCount) {
                modeCount = currentCount;
                mode = arr[i];
            }
        }

        System.out.println(mode);
    }
}
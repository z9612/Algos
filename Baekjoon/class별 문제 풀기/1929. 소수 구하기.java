import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); //3
        int N = sc.nextInt(); //16

        boolean[] isNotPrime = new boolean[N + 1]; //소수가 아닌지 체크
        isNotPrime[1] = true; //1은 소수가 아니다.

        //에라토스테네스의 채 방식
        for (int i = 2; i <= N; i++) {
            int temp = i * 2;

            int j = 2;
            while (temp <= N) {
                isNotPrime[temp] = true;
                temp = i * j;
                j++;
            }
        }

        //소수가 아닌 애들만 출력
        for (int i = M; i <= N; i++) {
            if (isNotPrime[i] == false) {
                System.out.println(i);
            }
        }
    }
}
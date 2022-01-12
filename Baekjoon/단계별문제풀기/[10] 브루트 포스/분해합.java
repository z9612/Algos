import java.util.Scanner;

public class 분해합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //216
        int N = sc.nextInt();

        for (int i = 1; i < 1_000_000; i++) {
            //숫자 i 의 분해합 구하기
            String str = Integer.toString(i);
            char[] chars = str.toCharArray();
            int sum = i;

            for (int j = 0; j < chars.length; j++) {
                sum += chars[j] - '0'; //char to int
            }

            //분해합이 N과 같으면 i를 출력하고 종료
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);

    }
}
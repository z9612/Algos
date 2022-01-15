import java.util.Scanner;

public class 연산자_끼워넣기 {

    static int N;
    static int[] numbers;
    static int[] opCount;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        numbers = new int[N];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        opCount = new int[4];
        for (int i = 0; i < opCount.length; i++) {
            opCount[i] = sc.nextInt();
        }

        permutation(0, numbers[0]);

        System.out.println(max);
        System.out.println(min);

    }

    /**
     * 연산자간의 순열을 만들고
     * 주어진 numbers와 연산자들을 연산해서
     * 최대값과 최소값을 저장하는 함수
     */
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    private static void permutation(int cnt, int value) {
        if (cnt == N - 1) {
            max = Math.max(max,value);
            min = Math.min(min,value);
        }

        for (int i = 0; i < 4 ; i++) {
            if(opCount[i] > 0){
                opCount[i]--;
                permutation(cnt+1, operation(value,numbers[cnt+1],i));
                opCount[i]++;
            }
        }
    }

    private static int operation(int a, int b, int op) {
        switch (op) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
            default:
                return 0;
        }
    }
}
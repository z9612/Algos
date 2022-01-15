import java.util.Scanner;

public class 더하기 {


    static int result;
    static int n;
    static int[] numbers = {1, 2, 3};

    public static void main(String[] args) {
        //3
        //4
        //7
        //10

        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for (int i = 0; i < TC; i++) {
            n = sc.nextInt();
            func(0);

            System.out.println(result);
            result = 0;
        }

    }

    private static void func(int sum) {
        if (sum == n) {
            result++;
            return;
        } else if (sum > n) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            func(sum);
            sum -= numbers[i];
        }
    }
}
import java.util.Scanner;
import java.util.Stack;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String input = sc.next();

        int[] numbers = new int[27];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                stack.push((double) numbers[ch-'A']);
            } else {
                double numB = stack.pop();
                double numA = stack.pop();
                double res = 0;

                switch (ch) {
                    case '+':
                        res = numA + numB;
                        break;
                    case '-':
                        res = numA - numB;
                        break;
                    case '*':
                        res = numA * numB;
                        break;
                    case '/':
                        res = numA / numB;
                        break;
                }

                stack.push(res);
            }
        }

        System.out.printf("%.2f",stack.pop());
    }
}
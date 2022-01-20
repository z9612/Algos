import java.util.Scanner;
import java.util.Stack;

public class _110773_제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;
        int stack_size = stack.size();

        for (int i = 0; i < stack_size; i++) {
            sum += stack.pop();
        }

        System.out.println(sum);


    }
}

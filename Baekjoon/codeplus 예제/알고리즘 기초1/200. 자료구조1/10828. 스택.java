import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class _10828스택 {
    static int N;
    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String command = sc.next();

            if (command.equals("push")) {
                int num = sc.nextInt();

                stack.push(num);
            } else {
                switch (command) {
                    case "pop":
                        try {
                            sb.append(stack.pop() + "\n");
                        } catch (EmptyStackException e) {
                            sb.append(-1 + "\n");
                        }
                        break;
                    case "size":
                        sb.append(stack.size() + "\n");
                        break;
                    case "empty":
                        boolean isEmpty = stack.empty();
                        if (isEmpty) sb.append(1 + "\n");
                        else sb.append(0 + "\n");
                        break;
                    case "top":
                        try {
                            sb.append(stack.peek() + "\n");
                        } catch (EmptyStackException e) {
                            sb.append(-1 + "\n");
                        }
                        break;
                }
            }
        }

        System.out.println(sb.toString());
    }
}
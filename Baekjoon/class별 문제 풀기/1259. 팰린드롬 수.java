import java.util.Scanner;
import java.util.Stack;

public class _1259_팰린드롬_수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //121
        //1231
        //12421
        //0

        while (true) {
            String N = sc.next();
            char[] arrN = N.toCharArray(); //1, 2, 4, 2, 1
            if (N.equals("0")) {
                return;
            }

            Stack<Character> stack = new Stack<Character>();
            int length = (arrN.length / 2);

            // (length/2) - 1 까지는 push
            for (int i = 0; i < length; i++) {
                stack.push(arrN[i]);
            }

            if (arrN.length % 2 != 0) length++;

            while (!stack.isEmpty()) {
                if (stack.peek() == arrN[length]) {
                    stack.pop();
                } else {
                    break;
                }
                length++;
            }

            if (!stack.isEmpty()) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }


    }
}
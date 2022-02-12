import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //()(((()())(())()))(())
        String input = sc.nextLine();
        char[] crr = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        int res = 0, cnt = 0;

        for (int i = 0; i < crr.length; i++) {
            char c = crr[i];

            switch (c) {
                case '(':
                    stack.push('(');
                    cnt += 1;
                    break;
                case ')':
                    if (stack.peek() == '(') {
                        stack.push(')');
                        cnt -= 1;
                        res += cnt;
                    } else {
                        stack.push(')');
                        cnt -= 1;
                        res += 1;
                    }
                    break;
            }
        }

        System.out.println(res);
    }
}
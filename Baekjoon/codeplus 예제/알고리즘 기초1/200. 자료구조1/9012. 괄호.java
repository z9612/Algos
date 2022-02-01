import java.util.Scanner;
import java.util.Stack;

public class _9012괄호 {

    static int N;
    static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int tc = 0; tc < N; tc++) {
            String str = sc.next();

            if(Check(str)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

            stack.clear();
        }
    }

    private static boolean Check(String str) {
        int length = str.length();

        for (int i = 0; i < length ; i++) {
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push('(');
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.empty(); //반복문이 끝나고 스택에 괄호가 남아 있으면 false, 없으면 true
    }
}
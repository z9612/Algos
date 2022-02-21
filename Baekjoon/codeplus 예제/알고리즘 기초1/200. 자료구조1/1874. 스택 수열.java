import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //8
        int[] arr = new int[N+1];

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < arr.length ; i++) {
            arr[i] = sc.nextInt(); //4 3 6 8 7 5 2 1
        }

        int cnt = 1;
        for (int i = 1; i <= N ; i++) {
            //cnt가 arr[i]의 값이 될 때까지 push
            while(cnt <= arr[i]){
                stack.push(cnt);
                cnt++;
                sb.append("+\n");
            }

            if(stack.peek() == arr[i])
                stack.pop();
            sb.append("-\n");
        }

        if(stack.empty()){
            System.out.println(sb.toString());
        }
        else{
            System.out.println("NO");
        }
    }
}
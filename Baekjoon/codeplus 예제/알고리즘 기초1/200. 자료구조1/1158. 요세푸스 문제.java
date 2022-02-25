import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        //큐의 사이즈가 1일 때까지 반복
        while (queue.size() != 1) {
            //K-1번째까지 값은 맨 뒤로 보내버림
            for (int i = 0; i < K-1 ; i++) {
                queue.offer(queue.poll());
            }
            //K번째 값은 sb에 추가한 뒤 poll
            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">"); // queue에 하나만 있을 땐 그냥 뽑고 sb에 추가하면 된다.
        System.out.println(sb.toString());

    }
}
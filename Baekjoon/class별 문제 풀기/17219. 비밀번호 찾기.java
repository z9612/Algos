import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<String,String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(sc.next(), sc.next());
        }

        //map 중에서 key가 input과 같은 value 를 구하기
        for (int i = 0; i < M; i++) {
            String temp = sc.next();
            System.out.println(map.get(temp));
        }
    }
}
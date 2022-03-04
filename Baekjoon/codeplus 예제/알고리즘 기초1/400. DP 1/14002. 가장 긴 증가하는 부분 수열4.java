import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //6
        int[] inputs = new int[N]; //10 20 10 30 20 50
        int[] dp = new int[N];
        
        //최대 길이에 해당하는 원소들을 저장하기 위한 변수들
        StringBuilder sb = new StringBuilder(); 
        List<Integer> list = new ArrayList<>(); 

        for (int i = 0; i < N; i++) {
            inputs[i] = sc.nextInt();
        }

        Arrays.fill(dp, 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (inputs[i] > inputs[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        //최대 길이 출력
        int maxLen = Arrays.stream(dp).max().getAsInt();
        System.out.println(maxLen);

        //최대 길이에 해당하는 원소들 출력
        int temp = maxLen;
        int cnt = 0;

        //끝에서부터 거꾸로 원소들을 리스트에 추가
        for (int i = N - 1; i >= 0; i--) {
            if (dp[i] == temp) {
                list.add(inputs[i]);
                temp--;
                cnt++;
            }
            if (cnt == maxLen) {
                break;
            }
        }

        //원소들을 다시 정방향으로 출력하기 위함
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i) + " ");
        }
        System.out.println(sb.toString());
    }
}
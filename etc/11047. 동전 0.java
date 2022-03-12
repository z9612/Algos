import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];
        int cnt = 0;

        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }

        for (int i = N-1; i >= 0 ; i--) {
            if(K - coins[i] >= 0){
                K -= coins[i];
                i++;
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
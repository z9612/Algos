import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(); //60 이상
        int N = sc.nextInt(); //100 이하

        boolean[] isNotPrime = new boolean[N + 1];

        isNotPrime[1] = true;

        for (int i = 2; i <= N; i++) {
            int j = 2;

            while (i * j <= N) {
                isNotPrime[i * j] = true;
                j++;
            }
        }

        int sum = 0;
        int least = Integer.MAX_VALUE;

        for (int i = M; i <= N ; i++) {
            if(isNotPrime[i] == false){
                sum += i;
                least = Math.min(least,i);
            }
        }

        if(sum == 0){
            System.out.println(-1);
            return;
        }


        System.out.println(sum);
        System.out.println(least);


    }
}
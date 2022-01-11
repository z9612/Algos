import java.util.Scanner;

public class 영화감독_숌 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //N번째 종말의 수를 구하자
        int num = 666;
        int cnt = 0;

        while (N <= 10000) {
            String sNum = Integer.toString(num);

            if(sNum.contains("666")){
                cnt++;
            }

            if(cnt == N){
                System.out.println(num);
                return;
            }

            num++;

        }
    }
}
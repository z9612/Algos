import java.util.Scanner;

//참고 자료 : https://m.blog.naver.com/grd406/221504540097

public class 카잉달력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for (int tc = 0; tc < TC; tc++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int year = x;
            y %= N; // y와 N이 같은 경우를 처리해 줌

            //year이 종말일을 넘거나 y가 정해지면 종료
            while((year <= M * N) && year % N != y) {
                year += M;
            }

            year = (year > M * N) ? -1 : year;
            System.out.println(year);


        }
    }
}
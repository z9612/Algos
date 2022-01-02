import java.util.Scanner;

public class Main {
    //2
    //6 12 10
    //30 50 72
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for (int tc = 0; tc < TC; tc++) {
            int H = sc.nextInt(); //몇 층
            int W = sc.nextInt(); //방 번호
            int N = sc.nextInt(); //몇 번째 손님

            int[][] map = new int[H + 1][W + 1];
            int cnt = 1;

            int resultH = 0;
            int resultW = 0;

            for (int j = 1; j <= W; j++) {
                for (int i = 1; i <= H; i++) {
                    map[i][j] = cnt++;
                }
            }

//            for (int i = 1; i <= H; i++) {
//                for (int j = 1; j <= W; j++) {
//                    System.out.print(map[i][j] + " ");
//                }
//                System.out.println();
//            }

            here:
            for (int i = 1; i <= H; i++) {
                for (int j = 1; j <= W; j++) {
                    if (map[i][j] == N) {
                        resultH = i;
                        resultW = j;
    
                        break here;
                    }
                }
            }

            if (resultW < 10) {
                System.out.println(resultH + "0" + resultW);
            } else {
                System.out.println(resultH + "" + resultW);
            }
        }
    }
}

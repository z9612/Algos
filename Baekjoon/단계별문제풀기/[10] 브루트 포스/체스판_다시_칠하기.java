import java.util.Scanner;

public class 체스판_다시_칠하기 {
    static int R;
    static int C;
    static char[][] map;
    static int min = 999; //다시 칠해야하는 최소 타일 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < R - 7; i++) {
            for (int j = 0; j < C - 7; j++) {
                func(i, j);
            }
        }

        System.out.println(min);

    }

    private static void func(int r, int c) {
        int R = r + 8;
        int C = c + 8;
        char temp = map[r][c]; //B 또는 W, 비교 타일 색깔
        int cnt = 0; //바꿔야할 타일 개수

        for (int i = r; i < R; i++) {
            for (int j = c; j < C; j++) {

                if (map[i][j] != temp) {
                    cnt++;
                }

                if (temp == 'W') temp = 'B';
                else temp = 'W';
            }

            if (temp == 'W') temp = 'B';
            else temp = 'W';
        }

        cnt = Math.min(cnt, 64 - cnt); 
        min = Math.min(min, cnt);
    }


}
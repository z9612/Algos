import java.util.Scanner;

public class 사탕게임 {

    static int N;
    static char[][] backupMap;
    static char[][] map;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new char[N][N];
        backupMap = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j);
                backupMap[i][j] = str.charAt(j);
            }
        }

        //행 방향 변환
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j] != map[i][j + 1]) {
                    char temp = map[i][j];
                    map[i][j] = map[i][j + 1];
                    map[i][j + 1] = temp;

                    checkMap(); //맵 체크
                    clearMap();// 맵 초기화
                }
            }
        }

        //열 방향 변환
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N-1; i++) {
                if (map[i][j] != map[i+1][j]) {
                    char temp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = temp;

                    checkMap(); //맵 체크
                    clearMap();// 맵 초기화
                }
            }
        }

        System.out.println(max);
    }

    private static void checkMap() {

        //행 방향 체크
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 0; j < N - 1; j++) {
                if (map[i][j] == map[i][j + 1]) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(cnt, max);
        }


        //열 방향 체크
        for (int j = 0; j < N; j++) {
            int cnt = 1;
            for (int i = 0; i < N - 1; i++) {
                if (map[i][j] == map[i+1][j]) {
                    cnt++;
                } else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                }
            }
            max = Math.max(cnt, max);
        }
    }

    //맵 초기화
    private static void clearMap() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = backupMap[i][j];
            }
        }
    }
}
import java.util.Scanner;

public class Main {

    static int[][][] Polynominos
            = {
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}}, {{0, 0}, {1, 0}, {2, 0}, {3, 0}}, //직선 모양
            {{0, 0}, {0, 1}, {1, 0}, {1, 1}}, //2x2 모양
            {{0, 0}, {1, 0}, {2, 0}, {2, 1}}, {{0, 0}, {0, 1}, {0, 2}, {1, 0}}, {{0, 0}, {0, 1}, {1, 1}, {2, 1}}, {{0, 2}, {1, 0}, {1, 1}, {1, 2}}, {{0, 2}, {1, 2}, {2, 2}, {2, 1}}, {{0, 0}, {1, 0}, {1, 1}, {1, 2}}, {{0, 0}, {0, 1}, {1, 0}, {2, 0}}, {{0, 0}, {0, 1}, {0, 2}, {1, 2}}, // 3+1모양
            {{0, 0}, {1, 0}, {1, 1}, {2, 1}}, {{0, 1}, {0, 2}, {1, 0}, {1, 1}}, {{0, 1}, {1, 0}, {1, 1}, {2, 0}}, {{0, 0}, {0, 1}, {1, 1}, {1, 2}}, //ㄴㄱ모양
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}}, {{0, 1}, {1, 0}, {1, 1}, {2, 1}}, {{0, 1}, {1, 0}, {1, 1}, {1, 2}}, {{0, 0}, {1, 0}, {2, 0}, {1, 1}}, // 가운데 볼록 모양
    };

    static int[][] Map;
    static int Row, Col;
    static int Res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Row = sc.nextInt();
        Col = sc.nextInt();

        Map = new int[Row][Col];

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                Map[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < Row; i++) {
            for (int j = 0; j < Col; j++) {
                simulate(i, j);
            }
        }

        System.out.println(Res);

    }

    //시작점 (i,j)에서 모든 polynominos의 경우에 row와 col 값이 맵 안이면
    // 그 polynominos 내의 합인 sum과 Res 값을 비교해서 더 큰 녀석을 Res에 저장한다
    private static void simulate(int row, int col) {
        for (int i = 0; i < Polynominos.length; i++) {
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                int curRow = row + Polynominos[i][j][0];
                int curCol = col + Polynominos[i][j][1];
                //맵 안이면
                if (curRow < Row && curCol < Col) {
                    sum += Map[curRow][curCol];
                }
                //맵 밖이면
                else {
                    break;
                }
            }
            Res = Math.max(Res, sum);
        }

    }
}
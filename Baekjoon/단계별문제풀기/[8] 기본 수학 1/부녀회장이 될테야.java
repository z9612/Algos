import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] apt = new int[15][15];//층 호, 0호는 쓰지 않지만 존재함

        //0층의 1~14호는 i호 만큼의 사람이 있다.
        for (int i = 1; i < 15; i++) {
            apt[0][i] = i;
        }
        //모든 층의 1호에는 1명이 있다
        for (int i = 1; i < 15; i++) {
            apt[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                for (int k = j; k >= 1; k--) {
                    apt[i][j] += apt[i-1][k];
                }
            }
        }

        int TC = sc.nextInt();

        for (int i = 0; i < TC; i++) {
            int k = sc.nextInt(); //층
            int n = sc.nextInt(); //호

            System.out.println(apt[k][n]);
        }
    }
}
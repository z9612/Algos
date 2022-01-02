import java.util.Arrays;
import java.util.Scanner;

public class 별찍기10 {
    static char[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new char[N][N];

        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(arr[i], ' ');
        }

        printStars(0, 0, N);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void printStars(int x, int y, int n) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int div = n / 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                printStars(x + (i * div), y + (j * div), div);
            }
        }
    }

}
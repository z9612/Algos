import java.util.Scanner;

public class 직사각형에서_탈출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int temp = Math.min(w - x, h - y);
        temp = Math.min(temp, x - 0);
        temp = Math.min(temp, y - 0);

        System.out.println(temp);

    }
}
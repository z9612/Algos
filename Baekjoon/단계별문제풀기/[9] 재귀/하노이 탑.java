import java.util.Scanner;

public class Main {

    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //원판의 개수

        hanoi(N, 1, 2, 3);
        System.out.println(cnt);
        System.out.println(sb);
    }

    private static void hanoi(int n, int start, int temp, int dest) {
        //기저 조건
        if (n == 0) {
            return;
        }

        //자기 위의 모든 원판을 임시 기둥으로 옮김
        hanoi(n - 1, start, dest, temp);

        //자신을 목적 기둥으로 옮김
        sb.append(start + " " + dest + "\n");
        cnt++;

        //임시 기둥의 원판들을 목적 기둥으로 옮김
        hanoi(n - 1, temp, start, dest);
    }
}

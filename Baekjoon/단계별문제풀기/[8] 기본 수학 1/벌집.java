import java.util.Scanner;

public class 벌집 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //목표 방 번호
        int result = 1; //필요한 거리
        int sum = 0; //구간이 지나가면 6씩 증가시킬 변수
        int max = 1; //그 구간의 최대 방 번호

        for (int i = 1; i <= N; i++) {
            if (i <= max) {
                continue;
            } else {
                result++;
                sum += 6;
                max += sum;
            }
        }

        System.out.println(result);

    }
}

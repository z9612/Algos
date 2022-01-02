import java.util.Scanner;

public class 평균은넘겠지 {

    //5
    //5 50 50 70 80 100
    //7 100 95 90 80 70 60 50
    //3 70 90 80
    //3 70 90 81
    //9 100 99 98 97 96 95 94 93 91

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for (int i = 0; i < TC; i++) {
            int N = sc.nextInt(); // 학생 수
            int[] grades = new int[N]; //각 학생의 점수
            int sum = 0;
            double avg = 0;
            int num = 0; // 평균보다 높은 점수를 가진 학생 수
            double ans = 0; // 결과 값

            for (int j = 0; j < grades.length; j++) {
                grades[j] = sc.nextInt();
                sum += grades[j];
            }

            avg = sum / grades.length;

            //평균보다 높은 점수를 가진 학생 수 구하기
            for (int j = 0; j < grades.length; j++) {
                if (grades[j] > avg) {
                    num++;
                }
            }

            ans = (double) num / (double) grades.length;
            System.out.printf("%.3f%%\n", ans * 100);
        }

    }
}

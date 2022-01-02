import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //시험 과목의 개수
        int max = -111_111_111; //입력 받은 시험 과목 점수 중 최고 점수
        int[] grades = new int[N];
        double[] newGrades = new double[N];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextInt();

            //최대 점수 저장하기
            if(max < grades[i]){
                max = grades[i];
            }
        }

        double sum = 0;
//        int avg = 0;

        //모든 점수를 (원점수 / max ) * 100으로 변환하기
        for (int i = 0; i < newGrades.length; i++) {
            newGrades[i] = ( (double) grades[i] / (double) max ) * 100;
            sum += newGrades[i];
        }

        //새로운 평균 출력
        System.out.println( sum/newGrades.length);

    }
}

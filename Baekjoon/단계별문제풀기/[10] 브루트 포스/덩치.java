import java.util.Arrays;
import java.util.Scanner;

public class 덩치 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //5
        //55 185
        //58 183
        //88 186
        //60 175
        //46 155
        int N = sc.nextInt(); //학생의 수
        int[] ranks = new int[N]; //덩치 순위를 저장한 배열
        Student[] srr = new Student[N];

        Arrays.fill(ranks, 1); //초기엔 모두 1위로 세팅

        for (int i = 0; i < srr.length; i++) {
            srr[i] = new Student(sc.nextInt(),sc.nextInt());

        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //내가 상대보다 덩치가 크면 상대 순위 증가
                if ((srr[i].weight > srr[j].weight) && (srr[i].height > srr[j].height)) {
                    ranks[j]++;
                }
            }
        }

        for (int el: ranks) {
            System.out.print(el + " ");
        }

    }

    public static class Student {
        int weight = 0;
        int height = 0;

        public Student(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public String toString() {
            return "student{" +
                    "weight=" + weight +
                    ", height=" + height +
                    '}';
        }
    }
}
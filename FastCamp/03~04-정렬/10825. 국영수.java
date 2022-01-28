import java.util.Arrays;
import java.util.Scanner;

public class _10825_국영수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Student[] students = new Student[N];

        //12
        //Junkyu 50 60 100  이름 국 영 수
        //Sangkeun 80 60 50
        //Sunyoung 80 70 100
        //Soong 50 60 90
        //Haebin 50 60 100
        //Kangsoo 60 80 100
        //Donghyuk 80 60 100
        //Sei 70 70 70
        //Wonseob 70 70 90
        //Sanghyun 70 70 80
        //nsj 80 80 80
        //Taewhan 50 60 90

        for (int i = 0; i < N; i++) {
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name);
        }
    }

    public static class Student implements Comparable<Student> {
        String name;
        int kor;
        int eng;
        int math;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getKor() {
            return kor;
        }

        public void setKor(int kor) {
            this.kor = kor;
        }

        public int getEng() {
            return eng;
        }

        public void setEng(int eng) {
            this.eng = eng;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public Student(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        @Override
        //국어 점수가 감소하는 순서로
        //국어 점수가 같으면 영어 점수가 증가하는 순서로
        //국어 점수와 영어 점수가 같으면 수학 점수가 감소하는 순서로
        //모든 점수가 같으면 이름이 사전 순으로 증가하는 순서로 (단, 아스키 코드에서 대문자는 소문자보다 작으므로 사전순으로 앞에 온다.)
        public int compareTo(Student o) {
            if (o.kor == this.kor && o.eng == this.eng && o.math == this.math) return this.name.compareTo(o.name);
            if (o.kor == this.kor && o.eng == this.eng) return o.math - this.math;
            if (o.kor == this.kor) return this.eng - o.eng;
            return o.kor - this.kor;
        }
    }
}
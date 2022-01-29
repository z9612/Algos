import java.util.Arrays;
import java.util.Scanner;

public class test {

    static int N;
    static Number[] A;
    static int[] B;

    public static class Number implements Comparable<Number> {
        int index;
        int value;

        public Number(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Number o) {
            if(this.value == o.value) Integer.compare(this.index,o.index);
            return Integer.compare(this.value, o.value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        A = new Number[N];
        B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = new Number(i,sc.nextInt());
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            B[A[i].index] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
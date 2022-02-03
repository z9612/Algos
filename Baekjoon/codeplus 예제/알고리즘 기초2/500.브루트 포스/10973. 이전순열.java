import java.util.Scanner;

// 참고자료 : https://dundung.tistory.com/58

public class _10973이전순열 {
    static int N;
    static int[] numbers;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //7
        //7 2 3 6 5 4 1

        N = sc.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        if(gotNextPermutation(numbers)){
            for (int i = 0; i < N ; i++) {
                System.out.print(numbers[i] + " ");
            }
        }else{
            System.out.println(-1);
        }

    }

    private static boolean gotNextPermutation(int[] numbers) {
        int i = N-1;
        int j = N-1;

        //i>0 이면서 arr[i] > arr[i-1]을 만족하는 가장 큰 i 찾기
        while(i>0 && numbers[i] >= numbers[i-1]){
            i -= 1;
        }

        if(i<=0) return false; // 이미 가장 numbers가 마지막 수열 배치 였을 경우 함수 종료

        while(numbers[j] >= numbers[i-1]){
            j -= 1;
        }

        swap(numbers,i-1,j);

        //numbers[i] 부터 numbers[N-1]까지 수열 reverse 시키기
        j = N-1;
        while(i < j){
            swap(numbers,i,j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
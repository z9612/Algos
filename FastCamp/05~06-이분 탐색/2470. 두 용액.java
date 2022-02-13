import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int L = 0;
        int R = arr.length-1;
        int difference = Integer.MAX_VALUE;

        int A = -1, B = -1;

        while (L < R) {

            int sum = arr[L] + arr[R];
            if(Math.abs(sum) < difference){
                A = arr[L];
                B = arr[R];
                difference = Math.abs(sum);
            }

            if (sum < 0) {
                L++;
            }else{
                R--;
            }
        }

        System.out.println(Math.min(A,B) + " " + Math.max(A,B));
    }
}
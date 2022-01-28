import java.util.Arrays;
import java.util.Scanner;

public class _1759암호만들기 {

    static int C; //C 개중
    static int L; //L개를 선택함
    static char[] inputs; //입력 배열
    static char[] arr; // 완성된 조합 배열
    static boolean[] isChecked; //이미 쓴 원소인지 체크
    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //4 6  L C
        //a t c i s w

        L = sc.nextInt();
        C = sc.nextInt();
        inputs = new char[C];
        arr = new char[L];
        isChecked = new boolean[C];
        sb = new StringBuilder();

        for (int i = 0; i < inputs.length; i++) {
            String str = sc.next();
            inputs[i] = str.charAt(0);
        }

        Arrays.sort(inputs);

        permutation(0, 0);
        System.out.println(sb.toString());
    }

    private static void permutation(int cnt, int start) {
        if (cnt == L) {
            if (isPossible(arr)) {
                for (char el : arr) {
                    sb.append(el);
                }
                sb.append("\n");
            }
            return;
        }

        for (int i = start; i < C; i++) {
            if (isChecked[i]) continue;

            isChecked[i] = true;
            arr[cnt] = inputs[i];

            permutation(cnt + 1, i + 1);
            isChecked[i] = false;
        }
    }

    //배열 유효성 체크
    static boolean isPossible(char[] arr) {
        int a = 0, b = 0; // 각각 모음과 자음 개수

        //해당 배열이 최소 1개의 모음과 2개의 자음을 가지고 있는지 체크
        for (char el : arr) {
            if (el == 'a' || el == 'e' || el == 'i' || el == 'o' || el == 'u') a++;
            else b++;

            if (a >= 1 && b >= 2) break;
        }

        //해당 배열이 증가하는 배열인지 체크
        int isOk = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) isOk++;
        }


        if (a >= 1 && b >= 2 && isOk == arr.length - 1) return true;

        return false;
    }
}
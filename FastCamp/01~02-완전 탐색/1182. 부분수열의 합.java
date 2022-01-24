import java.util.Scanner;

public class _1182_부분수열의_합 {
    //부분집합 만들기

    static int N, S;
    static int[] inputs;
    static boolean[] isChecked;
    static int res;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        S = sc.nextInt();
        inputs = new int[N];
        isChecked = new boolean[N];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = sc.nextInt();
        }

        powerSet(0);
        System.out.println(res);
    }

    //5 0
    //-7 -3 -2 5 8
    private static void powerSet(int cnt) {
        //기저 조건
        if (cnt == N) {
            int sum = 0;
            int falseCnt = 0; //공집합인지 체크
            
            for (int i = 0; i < N; i++) {
                if (isChecked[i]) sum += inputs[i];
                else falseCnt++;
            }
            
            //공집합이면 그냥 종료
            if(falseCnt == N) return;
            if (sum == S) res++;
            return;
        }

        //현재 원소를 부분집합에 넣기
        isChecked[cnt] = true;
        powerSet(cnt + 1);
        //현재 원소를 부분집합에 넣지 않기
        isChecked[cnt] = false;
        powerSet(cnt + 1);
    }
}
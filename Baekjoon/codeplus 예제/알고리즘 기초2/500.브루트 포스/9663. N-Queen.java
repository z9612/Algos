import java.util.Scanner;

public class _9663_Queen {
    static int N;
    static int[] colNo; // 퀸의 열 위치
    static int res = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        colNo = new int[N + 1];

        setQueen(1);
        System.out.println(res);
    }

    /**
     * @param cnt : 현재 퀸의 행 위치, N보다 커지면 종료한다
     */
    private static void setQueen(int cnt) {
        //현재 행의 퀸과 직전 퀸들에 대해서 유망성 검사
        if (!isAvailable(cnt - 1)) return;

        //기저 조건
        if (cnt > N) {
            res++;
            return;
        }

        //열 위치
        for (int i = 1; i <= N; i++) {
            colNo[cnt] = i;
            setQueen(cnt + 1);
        }
    }

    private static boolean isAvailable(int cnt) {
        //현재 놓을 퀸과 이전 퀸들이 같은 열에 있지 않은지, 대각선에 놓이지 않은지 체크
        for (int i = 1; i < cnt; i++) {
            if (colNo[i] == colNo[cnt] || (Math.abs(cnt - i) == Math.abs(colNo[cnt] - colNo[i])))
                return false;
        }
        return true;
    }
}

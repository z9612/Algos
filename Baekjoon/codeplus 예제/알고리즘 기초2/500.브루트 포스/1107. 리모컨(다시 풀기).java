import java.util.Scanner;

public class 리모컨 {

    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);

        int target = scan.nextInt();
        int R = scan.nextInt();

        //고장난 버튼 세팅
        boolean[] broken = new boolean[10];
        for(int i = 0; i < R; i++) {
            int n = scan.nextInt();
            broken[n] = true;
        }

        //500000
        //8
        //0 2 3 4 6 7 8 9

        int minCnt = Math.abs(target - 100); //초기값이 100번이므로 +나 -버튼으로만 이동하는 경우의 최솟값을 정함

        //최대값은 문제에서 500000이라고 되어있으나 리모콘이 9를 제외하고 모두 고장났다면
        //999999를 눌러서 찾는 경우도 포함되어야 하므로 최대값을 999_999으로 설정한다.
        for(int i = 0; i <= 999_999; i++) {
            String str = String.valueOf(i); //i를 String으로 변환
            int len = str.length();

            boolean isBreak = false;
            for(int j = 0; j < len; j++) {
                if(broken[str.charAt(j) - '0']) { //현재 수 i를 누르기 위해서 고장난 버튼을 눌러야 하면
                    isBreak = true;
                    break; //더 이상 탐색하지 않고 빠져나온다.
                }
            }
            if(!isBreak) { //i를 누를때 고장난 버튼을 누르지 않는다면
                int tempMin = Math.abs(target - i) + len; //i를 누른 후(len) target까지 이동하는 횟수(target - i)
                minCnt = Math.min(tempMin, minCnt);
            }
        }
        System.out.println(minCnt);
    }
}

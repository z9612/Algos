import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.trim();

        char[] crr = input.toCharArray();
        int blankCnt = 0;

        for (int i = 0; i < crr.length; i++) {
            if (crr[i] == ' ') {
                blankCnt++;
            }
        }

        //전부 공백으로 채워진 문자열이면 0 출력
        if (blankCnt == crr.length) {
            System.out.println(0);
        } else {
            System.out.println(blankCnt + 1);
        }

    }
}

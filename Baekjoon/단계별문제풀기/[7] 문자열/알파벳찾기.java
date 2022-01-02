import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] crr = input.toCharArray();
        int[] alphaLoc = new int[26]; //알파벳의 첫 등장 위치를 저장할 변수

        Arrays.fill(alphaLoc, -1); //-1로 초기화

        for (int i = 0; i < crr.length; i++) {
            //이미 등장한 알파벳이 아니라면 현재 위치인 i 저장
            if (alphaLoc[crr[i] - 97] == -1) {
                alphaLoc[crr[i] - 97] = i;
            }
        }

        for (int i = 0; i < alphaLoc.length; i++) {
            System.out.print(alphaLoc[i] + " ");
        }
    }
}

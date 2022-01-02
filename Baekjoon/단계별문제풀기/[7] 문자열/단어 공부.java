import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        input = input.toUpperCase(Locale.ROOT);
        char[] crr = input.toCharArray();
        int[] alphaCount = new int[26];


        for (int i = 0; i < crr.length; i++) {
            alphaCount[crr[i] - 65]++;
        }

        boolean isDuplicated = false; //최대치가 중복인지 체크
        int maxCount = -1;
        int maxChar = 0;

        for (int i = 0; i < alphaCount.length; i++) {
            if (maxCount < alphaCount[i]) {
                isDuplicated = false;
                maxCount = alphaCount[i];
                maxChar = i;
            } else if (maxCount == alphaCount[i]) {
                isDuplicated = true;
            }
        }

        if (isDuplicated) {
            System.out.println('?');
        } else {
            System.out.println((char) (maxChar + 65));
        }


    }
}

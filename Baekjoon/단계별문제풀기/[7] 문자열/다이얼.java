import java.util.Scanner;

public class 다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] crr = input.toCharArray();
        int result = 0;

        for (int i = 0; i < crr.length; i++) {
            result += getTime(crr[i]);
        }

        System.out.println(result);
    }

    static int getTime(char c) {
        switch (c){
            case 'A': case 'B': case 'C':
                return 3;
            case 'D': case 'E': case 'F':
                return 4;
            case 'G': case 'H': case 'I':
                return 5;
            case 'J': case 'K': case 'L':
                return 6;
            case 'M': case 'N': case 'O':
                return 7;
            case 'P': case 'Q': case 'R': case 'S':
                return 8;
            case 'T': case 'U': case 'V':
                return 9;
            case 'W': case 'X': case 'Y': case 'Z':
                return 10;
            default:
                return 0;
        }
    }
}

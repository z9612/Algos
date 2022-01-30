import java.util.Arrays;
import java.util.Scanner;

public class _10551_STROJOPIS {
    static int[] numbers; //각 손가락에 해당하는 자판이 몇 번씩 눌렸는지 체크

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //AON=BOO;
        String str = sc.next();
        numbers = new int[8];

        countStr(str);

        Arrays.stream(numbers).forEach(
                System.out::println
        );
    }

    private static void countStr(String str) {
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '1':
                case 'Q':
                case 'A':
                case 'Z':
                    numbers[0]++;
                    break;
                case '2':
                case 'W':
                case 'S':
                case 'X':
                    numbers[1]++;
                    break;
                case '3':
                case 'E':
                case 'D':
                case 'C':
                    numbers[2]++;
                    break;
                case '4':
                case '5':
                case 'R':
                case 'T':
                case 'F':
                case 'G':
                case 'V':
                case 'B':
                    numbers[3]++;
                    break;
                case '6':
                case '7':
                case 'Y':
                case 'U':
                case 'H':
                case 'J':
                case 'N':
                case 'M':
                    numbers[4]++;
                    break;
                case '8':
                case 'I':
                case 'K':
                case ',':
                    numbers[5]++;
                    break;
                case '9':
                case 'O':
                case 'L':
                case '.':
                    numbers[6]++;
                    break;
                case '0':
                case 'P':
                case ';':
                case '/':
                case '-':
                case '[':
                case ']':
                case '=':
                case '\'':
                    numbers[7]++;
                    break;
            }
        }
    }
}
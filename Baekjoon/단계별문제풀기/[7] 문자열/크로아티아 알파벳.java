import java.util.Scanner;

public class 크로아티아문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int result = 0;

        //ddz=z=
        for (int i = 0; i < chars.length; i++) {
            //마지막 문자에 도달했으면 아래로 더 내려가지 않고 result++ 한 후 마무리
            if (i == chars.length - 1) {
                result++;
                break;
            }

            switch (chars[i]) {
                case 'c':
                    switch (chars[i + 1]) {
                        case '=':
                        case '-':
                            continue;
                    }
                    result++;
                    break;
                case 'd':
                    switch (chars[i + 1]) {
                        case 'z':
                            if (i <= chars.length - 3 && chars[i + 2] == '=') {
                                continue;
                            }
                            break;
                        case '-':
                            continue;
                    }
                    result++;
                    break;
                case 'l':
                case 'n':
                    if (chars[i + 1] == 'j')
                        continue;
                    result++;
                    break;
                case 's':
                case 'z':
                    if (chars[i + 1] == '=')
                        continue;
                    result++;
                    break;
                default:
                    result++;
                    break;
            }
        }

        System.out.println(result);
    }
}

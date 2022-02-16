import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            //대문자일 때
            if (ch >= 'a' && ch <= 'z') {
                ch += 13;

                if (ch > 'z') {
                    ch -= 26;
                }
            }
            //소문자일 때
            else if (ch >= 'A' && ch <= 'Z') {
                ch += 13;

                if (ch > 'Z') {
                    ch -= 26;
                }
            }
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
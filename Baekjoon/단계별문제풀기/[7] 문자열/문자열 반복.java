import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();

        for (int i = 0; i < TC; i++) {
            int R = sc.nextInt();
            String input = sc.next();
            char[] chars = input.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(chars[j]);
                }
            }
            System.out.println();
        }
    }
}

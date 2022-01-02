import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //734 893
        String a = sc.next();
        String b = sc.next();

        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();

        String newA = aChars[2] + "" + aChars[1] + "" + aChars[0];
        String newB = bChars[2] + "" + bChars[1] + "" + bChars[0];

        int resultA = Integer.parseInt(newA);
        int resultB = Integer.parseInt(newB);

        System.out.println(resultA > resultB ? resultA : resultB);
    }
}

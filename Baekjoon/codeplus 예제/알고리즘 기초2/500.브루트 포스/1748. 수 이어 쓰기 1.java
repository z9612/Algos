import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        String nine = "0";

        int length = (int)Math.log10(N)+1; //3

        for (int i = 0; i < length; i++) {
            result += (N - Integer.parseInt(nine));
            nine += "9";
        }

        System.out.println(result);

    }
}
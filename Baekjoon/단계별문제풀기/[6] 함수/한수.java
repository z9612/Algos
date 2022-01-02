import java.util.Scanner;

public class 한수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i++) {
            if (i <= 99) {
                result++;
            } else {
                String str = Integer.toString(i); //110
                char[] crr = str.toCharArray(); //[1, 1, 0]

                if ((crr[0] - '0') - (crr[1] - '0') == (crr[1] - '0') - (crr[2] - '0')) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}

import java.util.Scanner;

//첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //input nums
        String str = sc.next(); // 1. get numbers without blank
        char[] chars = new char[N];
        int[] numbers = new int[N];
        int sum = 0;

        //2. string to chars
        for (int i = 0; i < chars.length; i++) {
            chars[i] = str.charAt(i);
        }

        //3. chars to integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = chars[i] - '0';
        }

        //add all numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}

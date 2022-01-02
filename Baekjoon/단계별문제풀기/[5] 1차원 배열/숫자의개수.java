import java.util.Scanner;

//150
//266
//427

public class 숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] numbers = new int[10]; //0~9의 개수를 저장할 배열

        int result = a * b * c;
        String strResult  = Integer.toString(result);
        char[] chars = strResult.toCharArray();

        for (char temp: chars) {
            switch (temp){
                case '0':
                    numbers[0]++;
                    break;
                case '1':
                    numbers[1]++;
                    break;
                case '2':
                    numbers[2]++;
                    break;
                case '3':
                    numbers[3]++;
                    break;
                case '4':
                    numbers[4]++;
                    break;
                case '5':
                    numbers[5]++;
                    break;
                case '6':
                    numbers[6]++;
                    break;
                case '7':
                    numbers[7]++;
                    break;
                case '8':
                    numbers[8]++;
                    break;
                case '9':
                    numbers[9]++;
                    break;
            }
        }

        for(int num : numbers){
            System.out.println(num);
        }
    }
}

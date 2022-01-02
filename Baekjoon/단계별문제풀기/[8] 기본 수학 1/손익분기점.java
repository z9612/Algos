import java.util.Scanner;

public class 손익분기점 {

    //손익분기점 즉 최초로 이익이 발생하는 판매량 출력하기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //고정 비용
        int B = sc.nextInt(); //가변 비용
        int C = sc.nextInt(); //노트북 가격
        int result = 0; // 고정비용 + (가변비용 * X) == (노트북 가격 * X)

        //가변비용이 노트북가격보다 같거나 크면 아무리 많이 팔아도 이익을 낼 수 없다.
        if (B >= C) {
            result = -1;
        } else if (B < C) {
            C = C - B;
            result = A / C;
            result++;
        }

        System.out.println(result);
    }
}

public class 셀프넘버 {
    public static void main(String[] args) {

        boolean[] numbers = new boolean[10036]; //dn(9999) => 10035이므로 0~10035를 담을 배열 선언, 생성자를 가지는 수인지 체크함

        for (int i = 1; i <= 10000; i++) {
            numbers[dn(i)] = true;
            if (!numbers[i]) {
                System.out.println(i);
            }
        }
    }

    //dn(n)을 구하는 함수
    static int dn(int num) {
        int res = num;

        if (num >= 10000) {
            res += num / 10000;
            num = num % 10000;
        }
        if (num >= 1000) {
            res += num / 1000;
            num = num % 1000;
        }
        if (num >= 100) {
            res += num / 100;
            num = num % 100;
        }
        if (num >= 10) {
            res += num / 10;
            num = num % 10;
        }
        return res += num;
    }
}

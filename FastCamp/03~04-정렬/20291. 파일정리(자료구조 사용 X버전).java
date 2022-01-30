import java.util.Arrays;
import java.util.Scanner;

public class 파일정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        String[] strings = new String[N];
        int[] cntArr = new int[N];
        //8
        //sbrus.txt
        //spc.spc
        //acm.icpc
        //korea.icpc
        //sample.txt
        //hello.world
        //sogang.spc
        //example.txt

        //확장자만 strings에 넣는 작업
        for (int i = 0; i < N; i++) {
            String str = sc.next();

            int index = str.lastIndexOf(".");
            char[] crr = str.toCharArray();

            for (int j = index + 1; j < crr.length; j++) {
                sb.append(crr[j]);  // exe
            }

            strings[i] = sb.toString();
            sb = new StringBuilder(); //sb 초기화
        }

        Arrays.sort(strings);

        int cnt = 1;
        String temp = strings[0];

        for (int i = 1; i < strings.length; i++) {

            if (temp.equals(strings[i])) {
                cnt++;
            } else {
                System.out.println(strings[i-1] + " " + cnt);
                temp = strings[i];
                cnt = 1;
            }
            if(i == strings.length-1){
                System.out.println(strings[i] + " " + cnt);
                return;
            }
        }


    }
}
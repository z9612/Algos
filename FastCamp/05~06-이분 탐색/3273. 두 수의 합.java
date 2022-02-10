import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = 0;
        List<Integer> list = new ArrayList<>(); //정렬된 set

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int target = sc.nextInt();

        Collections.sort(list);

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int sum = list.get(start) + list.get(end);
            if (sum == target) res++;

            if (sum <= target) start++;
            else end--;
        }

        System.out.println(res);
    }


}
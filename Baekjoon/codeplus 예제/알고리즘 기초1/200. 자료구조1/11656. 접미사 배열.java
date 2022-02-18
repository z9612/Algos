import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<String> list = new ArrayList<>();
        list.add(input);

        for (int i = 1; i < input.length() ; i++) {
            list.add(input.substring(i));
        }

        Collections.sort(list);

        for (String str: list) {
            System.out.println(str);
        }
    }
}
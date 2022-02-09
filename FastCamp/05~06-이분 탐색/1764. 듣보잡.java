import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        HashSet<String> setA = new HashSet<>(); 
        List<String> result = new ArrayList<>();


        for (int i = 0; i < M; i++) {
            setA.add(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(setA.contains(str)){
                result.add(str);
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        result.stream().forEach(System.out::println);

    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] nameArr = new String[N+1];

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name,i);
            nameArr[i] = name;
        }

        for (int i = 0; i < M ; i++) {
            String inputStr = br.readLine();

            //숫자가 들어오면 이름을 sb에 넣기
            if(isNumeric(inputStr)){
                int index = Integer.parseInt(inputStr);
                sb.append(nameArr[index]+ "\n");
            }
            //이름이 들어오면 숫자를 sb에 넣기
            else{
                sb.append(map.get(inputStr)+ "\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}
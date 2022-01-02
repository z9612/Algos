import java.util.Scanner;

public class 그룹_단어_체커 {
    //5
    //ab
    //aa
    //aca
    //ba
    //bb
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int TC = sc.nextInt();
        int result = 0;

        for (int i = 0; i < TC ; i++) {
            String input = sc.next();
            boolean[] alphabets = new boolean[26]; //나왔던 알파벳인지 방문 체크
            char[] chars = input.toCharArray();

            alphabets[chars[0]-'a'] = true; //첫 글자를 방문했음 체크

            for (int j = 1; j < chars.length; j++) {
                //직전 문자와 같으면 그냥 넘어감
                if(chars[j] == chars[j-1]){
                    continue;
                }
                //처음 등장한 문자인지 체크
                else{
                    //처음 방문한게 아니면 이것은 그룹 단어가 아니므로 break;
                    if(alphabets[chars[j]-'a']){
                        result--; //break를 하더라도 for문 밖에서 result++을 한 번 하게 되므로 미리 한 번 빼줌
                        break;
                    }
                    //처음 방문한게 맞다면 방문 체크 해줌
                    else{
                        alphabets[chars[j]-'a'] = true;
                    }
                }
            }
            result++;
        }

        System.out.println(result);
    }
}

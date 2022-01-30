import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _1181_사전정렬 {

    static int N;
    static Set<Word> words;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        words = new TreeSet<>();  //TreeSet 을 활용하면 '정렬된 중복 제거' 값을 획득할 수 있다.

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            words.add( new Word(str, str.length()));
        }

        for (Word word: words) {
            System.out.println(word.word);
        }
    }

    public static class Word implements Comparable<Word>{
        String word;
        int length;

        public Word(String word, int length) {
            this.word = word;
            this.length = length;
        }

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public int compareTo(Word o) {
            if(this.length == o.length) return this.word.compareTo(o.word);
            return Integer.compare(this.length,o.length);
        }
    }
}
public class 정수_N개의_합 {
    long sum(int[] a) {
        long ans = 0;

        for (int el: a) {
            ans += el;
        }
        return ans;
    }
}

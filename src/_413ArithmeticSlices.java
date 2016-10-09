public class _413ArithmeticSlices {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(new _413ArithmeticSlices().numberOfArithmeticSlices(A));
    }

    public int numberOfArithmeticSlices(int[] A) {
        int len = A.length;
        int ans = 0, count = 0;
        if (len < 3) return 0;
        int delta = A[1] - A[0];
        for (int i = 2; i < len; i++) {
            if (A[i] - A[i - 1] == delta) {
                count++;
                ans += count;
            } else {
                delta = A[i] - A[i - 1];
                count = 0;
            }
        }
        return ans;
    }
}

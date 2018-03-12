public class _70ClimbingStairs {
    private int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] step = new int[n + 1];
        step[0] = 0;
        step[1] = 1;
        step[2] = 2;
        for (int i = 3; i <= n; i++) {
            step[i] = step[i - 1] + step[i - 2];
        }
        return step[n];
    }

    public static void main(String[] args) {
        System.out.println(new _70ClimbingStairs().climbStairs(5));
    }
}

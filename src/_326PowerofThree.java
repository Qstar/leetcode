public class _326PowerofThree {
    private boolean isPowerOfThree(int n) {
        return n >= 1 && n == Math.pow(3, Math.round(Math.log(n) / Math.log(3)));
    }

    public boolean isPowerOfThree1(int n) {
        return n == 1 || n != 0 && n % 3 == 0 && isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        System.out.println(new _326PowerofThree().isPowerOfThree(20));
    }
}

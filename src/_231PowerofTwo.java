public class _231PowerofTwo {
    private boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new _231PowerofTwo().isPowerOfTwo(27));
    }
}

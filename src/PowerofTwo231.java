public class PowerofTwo231 {
    private boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(new PowerofTwo231().isPowerOfTwo(27));
    }
}

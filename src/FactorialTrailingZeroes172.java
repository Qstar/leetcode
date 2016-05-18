public class FactorialTrailingZeroes172 {
    public static void main(String[] args){
        System.out.println(new FactorialTrailingZeroes172().trailingZeroes(5));
        System.out.println(new FactorialTrailingZeroes172().trailingZeroes(6));
        System.out.println(new FactorialTrailingZeroes172().trailingZeroes(8));
    }

    private int trailingZeroes(int n){
        int count = 0;
        while (n > 0) {
            count += n / 5;
            n /= 5;
        }
        return count;
    }
}

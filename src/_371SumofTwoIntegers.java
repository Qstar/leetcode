public class _371SumofTwoIntegers {
    public static void main(String[] args){
        System.out.println(new _371SumofTwoIntegers().getSum(4, 5));
    }

    public int getSum(int a, int b){
        if (b == 0) {
            return a;
        }

        int xor = a ^ b;
        int and = (a & b) << 1;

        return getSum(xor, and);
    }
}

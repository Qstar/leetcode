public class SumofTwoIntegers371 {
    public static void main(String[] args){
        System.out.println(new SumofTwoIntegers371().getSum(4, 5));
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

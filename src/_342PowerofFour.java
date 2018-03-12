public class _342PowerofFour {
    public static void main(String[] args){
        System.out.println(new _342PowerofFour().isPowerOfFour1(16));
        System.out.println(new _342PowerofFour().isPowerOfFour1(5));
    }

    private boolean isPowerOfFour(int num){
        return num == 1 || num != 0 && num % 4 == 0 && isPowerOfFour(num / 4);
    }

    private boolean isPowerOfFour1(int num){
        return num >= 1 && num == Math.pow(4, Math.round(Math.log(num) / Math.log(4)));
    }
}

import java.util.Arrays;

public class _66PlusOne {
    private int[] plusOne(int[] digits) {
        int toPlus = 1;
        int len = digits.length;
        int ret[] = new int[len + 1];
        for (int i = len - 1; i >= 0; i--) {
            int sum = digits[i] + toPlus;
            toPlus = sum / 10;
            digits[i] = sum % 10;
            if (toPlus == 0) {
                break;
            }
        }
        if (toPlus != 1) {
            return digits;
        }
        for (int i = 0; i < len + 1; i++) {
            if (i == 0) {
                ret[i] = 1;
            } else {
                ret[i] = digits[i - 1];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] digits = {1,9};
        System.out.println(Arrays.toString(new _66PlusOne().plusOne(digits)));
    }
}

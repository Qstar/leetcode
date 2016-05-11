import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {
    private boolean isHappy(int n) {
        Set<Integer> num = new HashSet<>();
        while (true) {
            int result = 0;
            String number = String.valueOf(n);
            char[] numberArray = number.toCharArray();
            int len = number.length();
            for (int i = 0; i < len; i++) {
                result += Integer.parseInt(String.valueOf(numberArray[i])) * Integer.parseInt(String.valueOf(numberArray[i]));
            }

            if (result == 1) {
                return true;
            } else if (num.contains(result)) {
                return false;
            }
            num.add(result);
            n = result;
        }
    }

    public static void main(String[] args) {
        System.out.println(new HappyNumber202().isHappy(19));
        System.out.println(new HappyNumber202().isHappy(2));
    }
}

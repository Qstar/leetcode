import java.util.Set;

public class UglyNumber263 {
    private boolean isUgly(int num) {
        if (num < 1) return false;
        else if (num == 1) return true;
        else if (num % 2 == 0)
            return isUgly(num / 2);
        else if (num % 3 == 0)
            return isUgly(num / 3);
        else
            return num % 5 == 0 && isUgly(num / 5);
    }

    public static void main(String[] args) {
        System.out.println(new UglyNumber263().isUgly(905391974));
    }
}

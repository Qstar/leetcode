import java.util.ArrayList;
import java.util.List;

public class _412FizzBuzz {
    public static void main(String[] args) {
        System.out.println(new _412FizzBuzz().fizzBuzz(15));
    }

    public List<String> fizzBuzz(int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ret.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ret.add("Fizz");
            } else if (i % 5 == 0) {
                ret.add("Buzz");
            } else {
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }
}

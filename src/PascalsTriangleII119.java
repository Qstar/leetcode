import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleII119 {
    private List<Integer> getRow(int rowIndex) {
        List<Integer> ret = new ArrayList<>(Collections.nCopies(rowIndex + 1, 1));
        for (int i = 0; i < rowIndex + 1; i++) {
            for (int j = i - 1; j >= 1; j--) {
                ret.set(j, ret.get(j) + ret.get(j - 1));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangleII119().getRow(3));
    }
}

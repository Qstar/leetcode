import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle118 {
    private List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 0));
            ret.add(i, row);
            ret.get(i).set(0, 1);
            ret.get(i).set(ret.get(i).size() - 1, 1);
            for (int j = 1; j < ret.get(i).size() - 1; j++) {
                ret.get(i).set(j, ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new PascalsTriangle118().generate(5));
    }
}

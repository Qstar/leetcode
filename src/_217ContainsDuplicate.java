import java.util.HashSet;

public class _217ContainsDuplicate {
    public static void main(String[] args){
        System.out.println(new _217ContainsDuplicate().containsDuplicate(new int[]{1, 5, -2, -4, 0}));

    }

    private boolean containsDuplicate(int[] nums){
        boolean flag = false;
        int len = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (len != set.size()) {
            flag = true;
        }
        return flag;
    }
}

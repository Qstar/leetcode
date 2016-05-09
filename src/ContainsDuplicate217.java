import java.util.HashSet;

public class ContainsDuplicate217 {
    public static void main(String[] args){
        System.out.println(new ContainsDuplicate217().containsDuplicate(new int[]{1, 5, -2, -4, 0}));

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

import java.util.Arrays;

public class MoveZeroes283 {
    public static void main(String[] args){
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes283().moveZeroes(nums);
        Arrays.stream(nums).forEach(e -> System.out.print(e + " "));
    }

    private void moveZeroes(int[] nums){
        int len = nums.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int k = j; k < len; k++) {
            nums[k] = 0;
        }
    }
}

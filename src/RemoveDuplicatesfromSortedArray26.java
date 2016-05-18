public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args){
        int[] nums = {1, 1, 2};
        System.out.println(new RemoveDuplicatesfromSortedArray26().removeDuplicates(nums));
    }

    private int removeDuplicates(int[] nums){
        if (nums == null || nums.length < 0) return 0;
        int j = 0;
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}

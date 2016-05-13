public class RemoveElement {
    private int removeElement(int[] nums, int val) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(new RemoveElement().removeElement(nums, val));
    }
}

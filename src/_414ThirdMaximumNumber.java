public class _414ThirdMaximumNumber {
    public static void main(String[] args) {
        int data[] = {1, 2, 2, 5, 3, 5};
        System.out.println(new _414ThirdMaximumNumber().thirdMax(data));
    }

    public int thirdMax(int[] nums) {
        int len = nums.length;
        if (len < 3) {
            return Math.max(nums[0], nums[1]);
        } else if (len == 3) {
            return Math.min(nums[0], Math.min(nums[1], nums[2]));
        } else {
            int[] ret = new int[3];
            ret[0] = nums[0];
            ret[1] = nums[1];
            ret[2] = nums[2];
            for (int i = 0; i < len - 3; i++) {
                if (nums[i + 3] > ret[0]) {
                    ret[0] = nums[i + 3];
                } else if (nums[i + 3] > ret[1]) {
                    ret[1] = nums[i + 3];
                } else if (nums[i + 3] > ret[2]) {
                    ret[2] = nums[i + 3];
                }
            }
            return Math.min(ret[0], Math.min(ret[1], ret[2]));
        }
    }
}

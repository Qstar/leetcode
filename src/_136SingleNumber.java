public class _136SingleNumber {
    public static void main(String[] args){
        System.out.println(new _136SingleNumber().singleNumber(new int[]{2, 2, 1}));
        System.out.println(new _136SingleNumber().singleNumber(new int[]{17, 12, 5, -6, 12, 4, 17, -5, 2, -3, 2, 4, 5, 16, -3, -4, 15, 15, -4, -5, -6}));
    }

    public int singleNumber(int[] nums){
        int len = nums.length, i = 0;
        while (i < len) {
            int pointer = i + 1;
            if (pointer < len - 1) {
                while (nums[i] != nums[pointer]) {
                    pointer++;
                    if (pointer > len - 1) {
                        return nums[i];
                    }
                }
                int temp = nums[i + 1];
                nums[i + 1] = nums[pointer];
                nums[pointer] = temp;
            } else {
                return nums[i];
            }
            i += 2;
        }
        return -1;
    }

    public int singleNumber1(int[] nums){
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

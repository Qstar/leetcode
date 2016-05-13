/**
 * 动态规划，设置maxV[i]表示到第i个房子位置，最大收益。
 * 递推关系为maxV[i] = max(maxV[i-2]+num[i], maxV[i-1])
 * 注：可能会对上述递推关系产生疑问，是否存在如下可能性，maxV[i-1]并不含num[i-1]？
 * 结论是，在这种情况下maxV[i-1]等同于maxV[i-2]，因此前者更大。
 */
public class HouseRobber198 {
    private int rob(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        } else {
            int max[] = new int[len];
            max[0] = nums[0];
            max[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < len; i++) {
                max[i] = Math.max(max[i - 2] + nums[i], max[i - 1]);
            }
            return max[len - 1];
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1};
        System.out.println(new HouseRobber198().rob(nums));
    }
}

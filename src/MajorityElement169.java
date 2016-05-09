/**
 * ������ͬ�ľͻ������
 */
public class MajorityElement169 {
    public static void main(String[] args){
        System.out.println(new MajorityElement169().majorityElement(new int[]{1, 2, 3, 4, 2, 2, 2, 2}));
    }

    private int majorityElement(int[] nums){
        int len = nums.length;
        int majority = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                majority = num;
                count++;
            } else {
                if (majority == num)
                    count++;
                else
                    count--;

                if (count >= len / 2 + 1)
                    return majority;
            }
        }
        return majority;
    }
}

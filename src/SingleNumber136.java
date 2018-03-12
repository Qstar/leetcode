public class SingleNumber136 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        System.out.println(new SingleNumber136().SingleNumber136(arr));
    }

    public int SingleNumber136(int[] arr) {
        int ret = 0;
        for (int n : arr) ret = ret ^ n;
        return ret;
    }
}

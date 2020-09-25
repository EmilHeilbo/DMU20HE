package Week4;

public class BubbleSort {
    public static void main(String[] args) {

    }

    static void bsort(int[] nums) {
        int t;
        int size = nums.length;

        for (int i = 1; i < size; i++) {
            for (int j = size - 1; j >= i; j--) {
                if (nums[j - 1] > nums[j]) {
                    t = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = t;
                }
            }
        }
    }
}
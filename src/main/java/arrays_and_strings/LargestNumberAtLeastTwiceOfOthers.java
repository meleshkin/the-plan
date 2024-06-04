package arrays_and_strings;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        int[] nums = {0, 0, 4};
        System.out.println(dominantIndex(nums));
    }

    public static int dominantIndex(int[] nums) {
        int max=0;
        int maxIndex=0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] > max) {
                maxIndex = i;
                max = nums[i];
            }
        }
        if (max == 0) {
            return -1;
        }

        for (int i=0; i<nums.length; i++) {
            if (i != maxIndex && nums[i] != 0 && max / nums[i] < 2) {
                return -1;
            }
        }
        return maxIndex;
    }
}

package arrays101;

public class SquareOfSortingArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] result = new int[nums.length];
        int index = nums.length-1;

        int i = 0;
        int j = nums.length-1;
        while (i != j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j])) {
                result[index] = (nums[i] * nums[i]);
                i++;
            } else {
                result[index] = (nums[j] * nums[j]);
                j--;
            }
            index--;
        }
        result[index] = (nums[j] * nums[j]);
    }
}

package arrays101;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3};
        int[] res = sortArrayByParity(nums);
        System.out.println();
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        while(i < nums.length-1) {
            if (nums[i] % 2 != 0) {
                int j=i;
                while (j < nums.length-1 && nums[j] % 2 != 0) {
                    j++;
                }
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            i++;
        }
        return nums;
    }
}

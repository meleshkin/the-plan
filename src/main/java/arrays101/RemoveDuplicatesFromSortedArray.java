package arrays101;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 5};

        //int[] nums = {1, 2, 3};

        int step = 0;
        int k = 0;
        for (int i=1; i<nums.length; i++) {
            int x = nums[i-1];
            while (step<nums.length && x == nums[i] ){
                shiftLeft(nums, i);
                step++;
            }
            if (nums[i] != nums[i-1]) {
                ++k;
            }
        }

        System.out.println();

    }

    public static void shiftLeft(int[] arr, int to) {
        for (int i=to+1;  i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
    }
}

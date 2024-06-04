package arrays101;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 5};
        int k = removeDuplicates(nums);
        System.out.println();
    }

    public static int removeDuplicates(int[] nums) {
        int writePointer = 1;
        for (int readPointer=1; readPointer<nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer-1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        return writePointer;
    }
}

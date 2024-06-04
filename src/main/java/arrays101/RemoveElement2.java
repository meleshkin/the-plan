package arrays101;

public class RemoveElement2 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 8, 3, 2};
        removeElement(nums, 8);
        System.out.println();
    }

    public static int removeElement(int[] nums, int val) {
        int writePointer = 0;
        int readPointer = 0;
        while (readPointer < nums.length) {
            if (nums[readPointer] != val) {
                nums[writePointer++] = nums[readPointer];
            }
            readPointer++;
        }
        return writePointer;
    }
}

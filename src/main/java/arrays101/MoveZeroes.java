package arrays101;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 2, 4};
        moveZeroes(nums);
        //shiftLeft1(nums, 0);

        System.out.println();
    }

    public static void moveZeroes(int[] nums) {
        int rightPointer = nums.length-1;
        int leftPointer = 0;
        while(leftPointer < rightPointer) {
            if (nums[leftPointer]==0) {
                shiftLeftToOne(nums, leftPointer);
                nums[rightPointer] = 0;
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
    }
    public static void shiftLeftToOne(int[] nums, int from) {
        for (int i=from+1; i<nums.length; i++) {
            nums[i-1] = nums[i];
        }
    }
}

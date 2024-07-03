package arrays101;

public class BinSearchNoRecursion {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(search(nums, 1));
    }

    public static int search(int[] nums, int t) {
        int leftPointer = 0;
        int rightPointer = nums.length-1;

        while (leftPointer <= rightPointer) {
            int middle = (leftPointer + rightPointer) / 2;

            if (nums[middle] == t) {
                return middle;
            } else if (nums[middle] < t) {
                leftPointer = middle + 1;
            } else rightPointer = middle -1;
        }

        return -1;
    }
}

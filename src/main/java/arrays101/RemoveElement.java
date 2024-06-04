package arrays101;

public class RemoveElement {
    public static void main(String[] args) {
        /*
        int[] nums2 = {1, 2, 3, 5, 6};
        shiftLeft(nums2, 2);
        System.out.println();
         */


        int[] nums = {3,2,2,3};
        int val = 3;

/*
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

 */

        int res = removeElement(nums, val);
        System.out.println();
    }


    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int i = 0;
        while (i+k<nums.length) {
            if (nums[i] == val) {
                shiftLeft(nums, i);
                k++;
            } else {
                i++;
            }
        }
        return nums.length - k;
    }

    public static void shiftLeft(int[] nums, int from) {
        for (int i=from+1; i<nums.length; i++) {
            nums[i-1] = nums[i];
        }
    }
}

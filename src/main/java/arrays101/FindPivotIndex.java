package arrays101;

public class FindPivotIndex {
    public static void main(String[] args) {
        //int[] nums = {-1,-1,-1,-1,-1,-1};
        int[] nums = {2, -1, 1};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int[] sumLeft = new int[nums.length];
        int[] sumRight = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            int leftSum = 0;
            for (int left=0; left<=i; left++) {
                leftSum += nums[left];
                sumLeft[i] = leftSum;
            }
            int rightSum = 0;
            for (int right=i; right<nums.length; right++) {
                rightSum += nums[right];
                sumRight[i] = rightSum;
            }
        }

        for (int i=0; i<nums.length; i++) {
            if (sumLeft[i] == sumRight[i]) {
                return i;
            }
        }
        return -1;
    }
}

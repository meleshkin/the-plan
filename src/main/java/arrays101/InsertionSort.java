package arrays101;

public class InsertionSort {
    public static void main(String[] args) {
         int[] nums =  {1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

        public static int findMaxConsecutiveOnes(int[] nums) {
            int max1 = 0;
            for (int i=0; i<nums.length; i++) {
                int j=i;
                int cnt=0;
                while (j < nums.length && nums[j] == 1) {
                    cnt++;
                    j++;
                }
                if (cnt > max1) {
                    max1 = cnt;
                }
            }
            return max1;
        }
}

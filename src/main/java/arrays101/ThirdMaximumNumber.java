package arrays101;


public class ThirdMaximumNumber {
    public static void main(String[] args) {
        //int[] nums = {3, 4, 4, 5, 5, 5, 8, 9, 9, 9};
        int[] nums = {1, 2, Integer.MIN_VALUE};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        int[] tmp = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        boolean found3rdMax = false;
        for (int i=0; i<nums.length; i++) {
            if ( (nums[i] == tmp[1] || nums[i] == tmp[2] || nums[i] == tmp[0]) && nums[i] != Integer.MIN_VALUE) {
                continue;
            }

            if (nums[i] > tmp[0]) {
                int t1 = tmp[0];
                tmp[0] = nums[i];
                int t2 = tmp[1];
                tmp[1] = t1;
                tmp[2] = t2;
                if (tmp[2] != Integer.MIN_VALUE) found3rdMax = true;
            } else if (nums[i] > tmp[1]) {
                int t1 = tmp[1];
                tmp[1] = nums[i];
                tmp[2] = t1;
            } else if (nums[i] >= tmp[2]) {
                tmp[2] = nums[i];
                found3rdMax = true;
            }
        }


            /*
            for (int j=0; j<3; j++)
                    if (j == 0) {
                        if (nums[i] >= tmp[j]) {
                            tmp[j] = nums[i];
                        }
                    } else {
                        if (nums[i] >= tmp[j]) {
                            int t = tmp[j];
                            tmp[j] = nums[i];
                            tmp[j - 1] = t;
                        }
                    }
                }
        if (tmp[0] == Integer.MIN_VALUE) {
            return tmp[2];
        } else {
            return tmp[0];
        }

             */

        if (found3rdMax) return tmp[2];
        else return tmp[0];

    }
}

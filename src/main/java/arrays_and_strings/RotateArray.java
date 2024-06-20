package arrays_and_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RotateArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3};
        rotate2(nums, 3);
        System.out.println();

        /*
        int length = 6;
        int k = 3;
        int next = 0;
        System.out.println(getNext(6, 3, 5));
        */

    }


    public static void doRotate1(int[] nums) {
       int last = nums[nums.length-1];
        for (int i = nums.length-1; i>0; i--) {
           nums[i] = nums[i-1];
       }
       nums[0] = last;
    }

    public static void rotate2(int[] nums, int k) {
        if (nums.length > 1) {
            if (k > nums.length) {
                k = k % nums.length;
            }
            int memo = nums[0];
            int next = 0;
            int step = 0;
            int c = 0;
            Set<Integer> marked = new HashSet<Integer>();
            //marked.add(0);
            while (step < nums.length) {
                next = getNext(next, k, nums.length - 1);
                if (!marked.contains(next)) {
                    int t = memo;
                    memo = nums[next];
                    nums[next] = t;
                    step++;
                    marked.add(next);
                } else {
                    c++;
                    memo = nums[c];
                    next = getNext(c, k, nums.length - 1);
                    if (marked.contains(next)) {
                        next += 1;
                    }
                    int t = memo;
                    memo = nums[next];
                    nums[next] = t;
                    step++;
                    marked.add(next);
                }
            }
        }
    }

    public static int getNext(int next, int k, int max_next) {
        if (next + k <= max_next) {
            int t = next + k;
            return t;
        } else {
            int t = max_next-1 % (next + k) -1;
            if (t <= 0) t = 0;
            return t;
        }
    }
}

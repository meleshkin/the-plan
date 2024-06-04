package arrays101;

import scala.collection.LinearSeq;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static java.util.List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        return result;
    }

    public static java.util.List<Integer> findDisappearedNumbersExtraMemory(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] extra = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            extra[nums[i]-1] = 1;
        }

        for (int j=0; j<extra.length;j++) {
            if (extra[j] == 0) {
                result.add(j+1);
            }
        }
        return result;
    }
}

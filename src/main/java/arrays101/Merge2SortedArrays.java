package arrays101;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 19, 450};
        int[] arr2 = {3, 5, 19};
        System.out.println(Arrays.toString(merge(arr1, arr2)));
    }

    static int[] merge(int[] arr1, int[]arr2) {
        int firstIndex  = 0;
        int secondIndex = 0;
        int resultIndex = 0;
        int[] result = new int[arr1.length + arr2.length];

        while(firstIndex < arr1.length && secondIndex < arr2.length) {
            if (arr1[firstIndex] < arr2[secondIndex]) {
                result[resultIndex++] = arr1[firstIndex++];
            } else {
                result[resultIndex++] = arr2[secondIndex++];
            }
        }

        while (firstIndex < arr1.length) {
            result[resultIndex++] = arr1[firstIndex++];
        }

        while (secondIndex < arr2.length) {
            result[resultIndex++] = arr2[secondIndex++];
        }

        return result;
    }
}

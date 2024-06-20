package arrays_and_strings;

public class TwoSumSortedInputArray {
    public static void main(String[] args) {
        //int[] numbers = {1, 2, 4, 6, 15, 18};
        //int[] numbers = {0, 0, 3, 4};
        int[] numbers = {-1, 0};
        int[] res = twoSum(numbers, -1);
        System.out.println(res[0] + " " +res[1]);
    }

    public static int[] twoSumSlow(int[] numbers, int target) {
        int[] result = new int[2];

        for (int i=0; i<numbers.length; i++) {
            for (int j=0; j<numbers.length; j++) {
                if ( i != j && numbers[i] + numbers[j] == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int startPointer = 0;
        int endPointer = numbers.length-1;

        while (startPointer < endPointer) {
            if (numbers[startPointer] + numbers[endPointer] == target) {
                result[0] = startPointer+1;
                result[1] = endPointer+1;
                return result;
            } else if (numbers[startPointer] + numbers[endPointer] < target) {
                startPointer++;
            } else {
                endPointer--;
            }
        }
        return result;
    }


}

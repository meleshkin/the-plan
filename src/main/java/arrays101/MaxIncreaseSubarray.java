package arrays101;


// Максимальная неубывающая последовательность в массиве
public class MaxIncreaseSubarray {
    public static void main(String[] args) {
        int[] array = {94, 3, 57, 200, 982, 0, 2283, 59, 100, 102, 103, 104};

        int maxCnt = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for (int i=0; i<array.length; i++) {
            int j = i;
            while(j<array.length-1 && array[j] < array[j+1]) {
                if (j-i >= maxCnt) {
                    maxStart = i;
                    maxCnt++;
                    maxEnd = j+1;
                }
                j++;
            }
        }
        System.out.println();
    }
}

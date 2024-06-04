package arrays101;

public class ValidMountainArray {
    public static void main(String[] args) {
        //int[] arr = {0, 2, 3, 4, 5, 2, 1, 1};
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int i=0;
        while ( i<arr.length-1 && arr[i] < arr[i+1]) {
            i++;
        }
        if (i == arr.length || i == 0) {
            return false;
        } else {
            int j = i;
            while(j<arr.length-1 && arr[j] > arr[j+1] ) {
                j++;
            }
            return j == arr.length-1 && j != i;
        }
    }
}

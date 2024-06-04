package arrays101;

public class DuplicateZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        //nt[] arr = {0, 1, 2};
        duplicateZeros(arr);
        System.out.println();
    }

    public static void duplicateZeros(int[] arr) {
        /*
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == 0) {
                int x = arr[i];
                for (int j=i; j<arr.length-1; j++) {
                    int t =arr[j+1];
                    arr[j+1] = x;
                    x = t;
                }
                i++;
            }
        }
        */

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == 0) {
                for (int j=arr.length-1; j>i; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}

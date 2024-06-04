package arrays101;

public class MergeSortedArrays {
    public static void main(String[] args) {
        /*
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
         */



/*
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;

 */




        int[] nums1 = {1,0};
        int[] nums2 = {2};
        int m = 1;
        int n = 1;



        /*
        int[] nums1 = {4, 0, 0, 0, 0, 0};
        int[] nums2 = {1, 2, 3, 5, 6};
        int m = 1;
        int n = 5;

         */



        merge(nums1, m, nums2, n);
        System.out.println();
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int num1Len = m;
        while (index1 < num1Len && index2 < n) {
            if (nums1[index1] > nums2[index2]) {
                shiftRight(nums1, index1);
                num1Len++;
                nums1[index1] = nums2[index2];
                index2++;
            }
            index1++;
        }


        while(index2 < n){
            nums1[index1++] = nums2[index2++];
        }
    }

    public static void shiftRight(int[] arr, int from) {
        for (int i=arr.length-1; i>from; i--) {
            arr[i] = arr[i-1];
        }
    }
}

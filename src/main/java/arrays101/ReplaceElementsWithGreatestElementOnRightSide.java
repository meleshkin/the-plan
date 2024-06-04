package arrays101;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        //
        int[] arr = {17, 18, 0, 100};
        replaceElements(arr);
        System.out.println();
    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 0) return arr;
        if (arr.length == 1) {
            arr[arr.length-1] = -1;
            return arr;
        }

        for (int i=0; i<arr.length-1;) {
            int max=Integer.MIN_VALUE;
            int j=i+1;
            int maxIndex = i;
            while (j<arr.length) {
                if (arr[j]>max) {
                    max = arr[j];
                    maxIndex = j;
                }
                j++;
            }
            for(int k=i; k<=maxIndex; k++) {
                arr[k] = max;
            }
            i = maxIndex;
        }

        arr[arr.length-1] = -1;
        return arr;
    }


}

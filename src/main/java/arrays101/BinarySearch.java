package arrays101;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 79, 89, 99};
        System.out.println(binarySearch(array, 89, 0, array.length-1));
    }

    static int binarySearch(int[] array, int key, int low, int high) {
        if (low > high) return -1;
        int middle = (low + high) / 2;
        if (array[middle] == key) return middle;

        if (array[middle] > key)
            return binarySearch(array, key, low, middle-1);
        else
            return binarySearch(array, key, middle+1, high);
    }
}

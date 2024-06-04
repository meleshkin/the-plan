package arrays101;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[i] == 2*arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}

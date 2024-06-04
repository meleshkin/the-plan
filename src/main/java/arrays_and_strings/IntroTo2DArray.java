package arrays_and_strings;

public class IntroTo2DArray {
    public static void main(String[] args) {
        System.out.println("Example II:");
        int[][] b = new int[2][];
        printArray(b);
        System.out.println("Example III:");
        //b[0] = new int[3];
        b[0] = new int[]{1, 1, 1};
        //b[1] = new int[5];
        b[1] = new int[]{2, 2, 2, 2, 2};
        printArray(b);
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; a[i] != null && j < a[i].length; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
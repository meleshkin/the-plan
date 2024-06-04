package arrays_and_strings;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        /*
        int[][] matrix = new int[5][6];

        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[0][2] = 2;
        matrix[0][3] = 3;
        matrix[0][4] = 4;
        matrix[0][5] = 5;

        matrix[1][0] = 6;
        matrix[1][1] = 7;
        matrix[1][2] = 8;
        matrix[1][3] = 9;
        matrix[1][4] = 10;
        matrix[1][5] = 11;

        matrix[2][0] = 12;
        matrix[2][1] = 13;
        matrix[2][2] = 14;
        matrix[2][3] = 15;
        matrix[2][4] = 16;
        matrix[2][5] = 17;

        matrix[3][0] = 18;
        matrix[3][1] = 19;
        matrix[3][2] = 20;
        matrix[3][3] = 21;
        matrix[3][4] = 22;
        matrix[3][5] = 23;

        matrix[4][0] = 24;
        matrix[4][1] = 25;
        matrix[4][2] = 26;
        matrix[4][3] = 27;
        matrix[4][4] = 28;
        matrix[4][5] = 29;
        */

        /*
        int[][] matrix = new int [1][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
         */



        int[][] matrix = new int [4][1];
        matrix[0][0] = 1;
        matrix[1][0] = 2;
        matrix[2][0] = 3;
        matrix[3][0] = 4;


        /*
        int[][] matrix = new int [3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

         */

        System.out.println(spiralOrder(matrix));
    }

    public static java.util.List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();

        int topLine = 0;
        int botLine = matrix.length-1;
        int leftCol = 0;
        int rightCol = matrix[0].length-1;

        int num = matrix.length * matrix[0].length;
        int step = 0;

        while ( (topLine != botLine) || (leftCol != rightCol) ) {
            if (step >= num) return result;
            step += goHorizontal(matrix, topLine, leftCol, rightCol, result);
            if (step >= num) return result;
            step += goVertical(matrix, rightCol, topLine+1, botLine, result);
            if (step >= num) return result;
            step += goHorizontal(matrix, botLine, rightCol-1, leftCol, result);
            if (step >= num) return result;
            step += goVertical(matrix, leftCol, botLine-1, topLine+1, result);

            topLine++;
            botLine--;
            leftCol++;
            rightCol--;

        }
        if (topLine == botLine && leftCol == rightCol && step == num-1) {
            result.add(matrix[topLine][leftCol]);
        }


        return result;
    }


    public static int goVertical(int[][] matrix, int column, int startLine, int endLine, List<Integer> result) {
        int step = 0;
        if (startLine < endLine) {
            for (int i=startLine; i<=endLine; i++) {
                step++;
                result.add(matrix[i][column]);
            }
        } else if (startLine > endLine) {
            for (int i=startLine; i>= endLine; i--) {
                step++;
                result.add(matrix[i][column]);
            }
        } else {
            step++;
            result.add(matrix[startLine][column]);
        }

        return step;
    }

    public static int goHorizontal(int[][] matrix, int line, int startCol, int endCol, List<Integer> result) {
        int step = 0;
        if (startCol < endCol) {
            for (int i=startCol; i<=endCol; i++) {
                step++;
                result.add(matrix[line][i]);
            }
        } else if (startCol > endCol) {
            for (int i=startCol; i >= endCol; i--) {
                step++;
                result.add(matrix[line][i]);
            }
        } else {
            step++;
            result.add(matrix[line][startCol]);
        }

        return step;
    }
}

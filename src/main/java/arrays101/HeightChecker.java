package arrays101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeightChecker {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        List<Integer> list = new ArrayList<>(heights.length);
        for (int height : heights) {
            list.add(height);
        }

        Collections.sort(list);

        int result = 0;
        for (int i=0; i<heights.length; i++) {
            if (heights[i] != list.get(i)) {
                result++;
            }
        }

        return result;
    }
}

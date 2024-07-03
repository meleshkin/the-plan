package coderun;

import java.io.*;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nums = new int[3];
        boolean badTriangle = false;
        for (int i=0; i<3; i++) {
            nums[i] = Integer.parseInt(reader.readLine());
            if (nums[i] < 0) {
                badTriangle = true;
            }
        }
        if (badTriangle) {
            writer.write("NO");
        } else {
            if (nums[0] < nums[1] + nums[2] && nums[1] < nums[0] + nums[2] && nums[2] < nums[0] + nums[1]) {
                writer.write("YES");
            } else {
                writer.write("NO");
            }
        }


        reader.close();
        writer.close();
    }


}

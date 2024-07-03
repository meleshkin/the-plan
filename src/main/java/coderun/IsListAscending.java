package coderun;

import java.io.*;

public class IsListAscending {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int prev = 0;
        String result = null;
        for (int i=0; i< parts.length; i++) {
            int n = Integer.parseInt(parts[i]);
            if (i > 0) {
                if (n <= prev) {
                    result = "NO";
                    break;
                } else {
                    prev = n;
                }
            } else {
                prev = n;
            }
        }
        if (result == null) {
            result = "YES";
        }

        writer.write(result);
        reader.close();
        writer.close();

    }
}

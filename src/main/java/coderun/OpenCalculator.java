package coderun;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class OpenCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String buttons = reader.readLine();
        String target = reader.readLine();

        Set<Integer> targetSet = new HashSet<>();

        int n;
        for (int i=0; i<target.length(); i++) {
            n = Integer.parseInt(String.valueOf(target.charAt(i)));
            targetSet.add(n);
        }

        String[] parts = buttons.split(" ");
        for (int i=0; i<3; i++) {
            n = Integer.parseInt(parts[i]);
            targetSet.remove(n);
        }

        writer.write(String.valueOf(targetSet.size()));

        reader.close();
        writer.close();
    }
}

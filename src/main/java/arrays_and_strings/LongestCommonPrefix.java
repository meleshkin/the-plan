package arrays_and_strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"123","123","111"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        if (strs[0].isEmpty()) {
            return "";
        }

        int charPointer = 0;
        char currChar = strs[0].charAt(charPointer);
        while (check1char(strs, currChar, charPointer)) {
            sb.append(currChar);
            if (strs[0].length() > ++charPointer) {
                currChar = strs[0].charAt(charPointer);
            }
        }


        return sb.toString();
    }

    public static boolean check1char(String[] strs, char ch, int pos) {
        for (String s : strs) {
            if (s.length() <= pos || s.charAt(pos) != ch) {
                return false;
            }
        }
        return true;
    }


}

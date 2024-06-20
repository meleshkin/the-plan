package arrays_and_strings;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "qw e";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int i = 0;
        int j;
        StringBuilder res = new StringBuilder(s.length());
        while (i <= s.length()-1) {
            j = i;
            while (j <= s.length()-1 && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);
            res.append(reverse(word));
            res.append(" ");
            i = j + 1;
        }
        return res.toString().trim();
    }

    public static String reverse(String s) {
        if (s.length() == 1) {
            return s;
        }

        int i = 0;
        int j = s.length()-1;
        char[] res = new char[s.length()];

        while (i <= j) {
            char t = s.charAt(i);
            res[i] = s.charAt(j);
            res[j] = t;
            i++;
            j--;
        }
        return new String(res);
    }
}

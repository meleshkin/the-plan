package whatever;

public class SubstringSearch {
    public static void main(String[] args) {
        String str = "dkgh4kkf";
        String key = "kf";
        System.out.println(substrSearch(str, key));
    }

    static int substrSearch(String str, String key) {
        for (int i=0; i<=str.length()-key.length(); i++) {
            int j=0;
            while(j < key.length() && str.charAt(i+j) == key.charAt(j)) {
                j++;
            }
            if (j == key.length()) {
                return i;
            }
        }
        return -1;
    }
}

package arrays_and_strings;

public class StrStr {
    public static void main(String[] args) {
        String big = "mississippi";
        String small = "issip";
        System.out.println(strStr(big, small));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;

        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();

        int bigPointer = 0;
        int smallPointer = 0;

        while (bigPointer+smallPointer <= a.length-1) {
            smallPointer = 0;
            while (smallPointer <= b.length-1 && bigPointer+smallPointer <= a.length-1 && b[smallPointer] == a[bigPointer+smallPointer] ) {
                smallPointer++;
            }
            if (smallPointer == b.length){
                return bigPointer;
            } else {
                bigPointer++;
            }
        }
        return -1;

    }
}


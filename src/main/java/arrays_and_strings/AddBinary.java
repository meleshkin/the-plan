package arrays_and_strings;

public class AddBinary {
    public static void main(String[] args) {
        String a = "1101011";
        String b = "1";

        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        char[] num1;
        char[] num2;
        if (a.length() > b.length()) {
            num1 = a.toCharArray();
            num2 = b.toCharArray();
        } else {
            num1 = b.toCharArray();
            num2 = a.toCharArray();
        }

        char[] result = new char[num1.length];

        int carry = 0;
        int step = num2.length-1;
        for (int i = num1.length - 1; i >= 0; i--) {
            int nextDgt1 = 0;
            if (step >= 0) {
                if (num2[step] == '1') {
                    nextDgt1 = 1;
                }
                step--;
            }
            int nextDgt2 = 0;
            if (num1[i] == '1') {
                nextDgt2 = 1;
            }

            int k = nextDgt1 + nextDgt2 + carry;
            if (k == 0) {
                result[i] = '0';
                carry = 0;
            } else if (k == 1) {
                result[i] = '1';
                carry = 0;
            } else if (k == 2) {
                result[i] = '0';
                carry = 1;
            } else  {
                result[i] = '1';
                carry = 1;
            }
        }
        if (carry == 0) {
            return String.copyValueOf(result);
        } else {
           return "1" + String.copyValueOf(result);
        }
    }
}

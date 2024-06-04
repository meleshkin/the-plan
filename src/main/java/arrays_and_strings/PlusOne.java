package arrays_and_strings;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];
        int carry = 0;
        int pluser = 1;

        for (int readPointer=digits.length-1; readPointer>=0; readPointer--) {
            int res = digits[readPointer] + pluser + carry;
            pluser = 0;
            if (res >= 10) {
                result[readPointer] = res % 10;
                carry = 1;
            } else {
                result[readPointer] = res;
                carry = 0;
            }
        }
        if (carry == 1) {
            result[0] = 1;
            return result;
        } else {
            int[] r = new int[digits.length];
            System.arraycopy(result, 0, r, 0, digits.length);
            return r;
        }

    }

}

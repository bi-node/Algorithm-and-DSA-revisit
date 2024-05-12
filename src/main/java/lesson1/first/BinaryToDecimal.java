package lesson1.first;


public class BinaryToDecimal {
    public static void main(String[] args) {

        System.out.println(convertToDecimal("1011101000100"));

    }


    public static int convertToDecimal(String binary) {
        int result = 0;
        int conversion = 1;
        int len = binary.length() - 1;
        for (int i = len; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += conversion;
            }
            conversion *= 2;
        }


        return result;
    }
}



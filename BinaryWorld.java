public class BinaryWorld {
    public static void main(String[] args) {
        int decimalDigit = 7;
        String binaryCode = String.format("%4s", Integer.toBinaryString(decimalDigit)).replace(' ', '0');
        System.out.println("The number " + decimalDigit + " in BCD: " + binaryCode);

        // testing second method
        String bcdCode = getBcdCode(decimalDigit);
        System.out.println("The number " + decimalDigit + " in BCD: " + bcdCode);
    }

    public static String getBcdCode(int digit) {
        return switch(digit){
            case 0 -> "0000";
            case 1 -> "0001";
            case 2 -> "0010";
            case 3 -> "0011";
            case 4 -> "0100";
            case 5 -> "0101";
            case 6 -> "0110";
            case 7 -> "0111";
            case 8 -> "1000";
            case 9 -> "1010";
            default -> throw new IllegalAccessException("Meet false int from 0 -> 9");
    }
    }
}

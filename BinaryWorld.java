import java.util.Scanner;

public class BinaryWorld {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your number");

        int decimalDigit = 5;
        String binaryCode = String.format("%4s", Integer.toBinaryString(decimalDigit)).replace(' ', '0');
        System.out.println("The number " + decimalDigit + " in BCD: " + binaryCode);

        // testing second method
        String bcdCode = getBcdCode(decimalDigit);
        System.out.println("The number " + decimalDigit + " in BCD: " + bcdCode);

        String digitalString = myObj.nextLine();
        System.out.println("Username is: " + userName);

    }

    public static String getBcdCode(int digit) {
        return switch (digit) {
            case 0 -> "0000";
            case 1 -> "0001";
            case 2 -> "0010";
            case 3 -> "0011";
            case 4 -> "0100";
            case 5 -> "0101";
            case 6 -> "0110";
            case 7 -> "0111";
            case 8 -> "1000";
            case 9 -> "1001";
            default -> throw new IllegalArgumentException("Input must be between 0 and 9 false int from 0 -> 9");
        };
    }

}

import java.util.Scanner;

public class BinaryWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // system code - для чтения ввода
        System.out.println("=".repeat(40));// тут .repeat(40) просит написать 40 раз

        while (true) {
            System.out.println("\nInsert number (or 'exit' for exit): ");
            // Reading string
            String input = scanner.nextLine();

            // Check out if user wants to be out
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exit from the program. Bye bye");
                break;
            }

            try {
                // transform string to numbers
                int decimalDigit = Integer.parseInt(input);

                System.out.println("\nThe results for the number is " + decimalDigit + ":");
                System.out.println("-".repeat(30));

                // Way. Simple binar code
                String binaryCode = String.format("%4s", Integer.toBinaryString(decimalDigit)).replace(' ', '0');
                System.out.println("The number " + decimalDigit + " in BCD: " + binaryCode);

                // testing second method
                String bcdCode = getBcdCode(decimalDigit);
                System.out.println("The number " + decimalDigit + " in BCD: " + bcdCode);    
                    }

        }

       

   


        // System.out.println("Username is: " + bcdCode);
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

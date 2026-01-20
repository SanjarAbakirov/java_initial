import java.util.Scanner; // library from box - util.Scanner

public class BinaryWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // system code - для чтения ввода
        System.out.println("=".repeat(40));// тут .repeat(40) просит написать 40 раз "="
        System.out.println(" Convert to binary code ");
        System.out.println("=".repeat(40));
        System.out.println("\nInsert you number from 0 to 9: ");

        int number = scanner.nextInt(); // read the number from (System.in)

        if (number < 0 || number > 9) { // check out the number is in correct diapasone
            System.out.println("Mulfunctions! It must be from 0 to 9!");
        } else {
            String binaryCode = getBcdCode(number); // convert to binary code
            System.out.println("\n" + "-".repeat(30));
            System.out.println("Number: " + number);
            System.out.println("Binary code (BCD: " + binaryCode);
            System.out.println("-".repeat(30));
        }
        // closing scanner
        scanner.close();
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
            default -> "0000"; // here will never enter because of checking out
        };
    }
}

public class BinaryWorld {
    public static void main(String[] args) {
        int decimalDigit = 7;
        String binaryCode = String.format("%4s", Integer.toBinaryString(decimalDigit)).replace(' ', '0');
        System.out.println("The number" + decimalDigit + "in BCD: " + binaryCode),
    }
}
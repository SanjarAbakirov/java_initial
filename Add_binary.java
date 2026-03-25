import java.math.BigInteger;

// not big integer
// class Add_binary {
// public static void main(String[] args) {
// String a = "100";
// String b = "11";
// int sum1 = Integer.parseInt(a, 2);
// int sum2 = Integer.parseInt(b, 2);

// int sum = sum1 + sum2;
// String result = Integer.toBinaryString(sum);
// System.out.println("the result is: " + result);
// }
// }

// big integer
class Add_binary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
    };

    public String addBinary(String a, String b) {

        BigInteger sum1 = new BigInteger(a, 2);
        BigInteger sum2 = new BigInteger(b, 2);

        BigInteger sum = sum1.add(sum2);
        return sum.toString(2);
        System.out.println("the result is: " + sum);
    }
}
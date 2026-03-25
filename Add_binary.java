class Add_binary {
    public static void main(String[] args) {
        String a = "1001";
        String b = "111";
        int sum1 = Integer.parseInt(a, 2);
        int sum2 = Integer.parseInt(b, 2);

        int sum = sum1 + sum2;
        String result = Integer.toBinaryString(sum);
        System.out.println("the result is: " + result);
    }
}

class Add_binary {
    public String addBinary(String argss) {
        String a = "11";
        String b = "1";
        int sum1 = Integer.parseInt(a, 2);
        int sum2 = Integer.parseInt(b, 2);
        int sum = sum1 + sum2;
        String result = Integer.toBinaryString(sum);
        return result;
    }
}

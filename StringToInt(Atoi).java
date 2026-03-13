class StringToInt(Atoi){

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length && chars[i] == ' ') {
            i++;
            if (i == chars.length) {
                return 0;
            }
        }
    }
}

public class LongCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: empty array
        if (strs == null || strs.length == 0) {
            return "";
        }
        // Edge case: array with fulled array
        if (strs.length == 1) {
            return strs[0];
        }

        StringBuilder ans = new StringBuilder();

        // The first string like example
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean allEqual = true;
            for (int j = 1; j < strs.length; j++) {
                // if current str shorter or symbol is not coincide
                if (i >= strs[j].length() || c != strs[j].charAt(i)) {
                    allEqual = false;
                    break;
                }
            }

            if (allEqual) {
                ans.append(c); // added symbol
            } else {
                break;
            }

            return ans.toString(); // return instead of returns

        }

    }
}

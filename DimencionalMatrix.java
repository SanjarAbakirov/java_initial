public class DimencionalMatrix {
    public static int[][] multiplyMatrix(int[][] first, int[][] second) {
        int m = first.length;
        int n = first[0].length;
        int p = second[0].length;

        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += first[i][k] * second[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void main(String[] ans) {
        int[][] firstMatrix = {
                { 1, 2 },
                { 3, 4 }
        };
        int[][] secondMatrix = {
                { 5, 6 },
                { 7, 8 }
        };
        int[][] result = multiplyMatrix(firstMatrix, secondMatrix);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }
}
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
                { 1, 0, 2 },
                { -1, 3, 1 }
        };
        int[][] secondMatrix = {
                { 3, 1 },
                { 2, 1 },
                { 1, 0 }
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

// O(n * m * p)
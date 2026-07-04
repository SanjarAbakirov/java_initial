public class SpiralMatrix {




}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix == 0){
            return result;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++){
                result.add(matrix[i][bottom]);
                i++;
            }
            for (int j = left; j <= right; j++){
                result.add(matrix[right][j]);
                j++;
            }

        }

    }
}
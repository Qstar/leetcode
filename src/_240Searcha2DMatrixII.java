/**
 * 从右上角开始, 比较target 和 matrix[i][j]的值.
 * 如果小于target, 则该行不可能有此数,  所以i++;
 * 如果大于target, 则该列不可能有此数, 所以j--.
 * 遇到边界则表明该矩阵不含target.
 */
public class _240Searcha2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i < matrix.length && j >= 0) {
            int k = matrix[i][j];
            if (target == k) return true;
            else if (target < k) j--;
            else i++;
        }
        return false;
    }
}

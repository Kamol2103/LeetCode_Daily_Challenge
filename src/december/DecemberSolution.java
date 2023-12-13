package december;

import java.util.List;

public class DecemberSolution {

    // todo: december-5
    public int numberOfMatches(int n) {
        return n - 1;
    }
    //todo:successfully completed


    // TODO: 06/12/23
    public static int totalMoney(int n) {

        // TODO: 1+2+3+4+5+6+7
        // todo:2+3+4+5+6+7+8
        // todo:3+4+5+6+7+8

        int sum = 0;
        int count = 1;
        int countWeek = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 1 && i != 1) {
                count = 1;
                count += countWeek;
                countWeek++;
            }
            sum += count;
            count++;
        }
        return sum;
        // todo: successfully completed
    }



    // TODO: 07/12/23

        public String largestOddNumber(String num) {
            for (var i = num.length() - 1; i >= 0; i--)
                if (Character.getNumericValue(num.charAt(i)) % 2 == 1)
                    return num.substring(0, i+1);

            return "";
        }

    // TODO: 10/12/23
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
    // todo:Successfully completed

    // TODO: 11/12/23
        public int findSpecialInteger(int[] arr) {
            int n = arr.length;
            int quarter = n / 4;

            for (int i = 0; i < n - quarter; i++) {
                if (arr[i] == arr[i + quarter]) {
                    return arr[i];
                }
            }

            return -1;
        }
    // TODO:Successfully completed


    // TODO: 12/12/23

    public int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        return (firstMax - 1) * (secondMax - 1);
    }

    //todo: success

    //todo: 13.12.2023
        public int numSpecial(int[][] mat) {
            int m = mat.length;
            int n = mat[0].length;
            int count = 0;

            // Count the number of special positions
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1) {
                        // Check the entire row for 1
                        boolean isRowSpecial = true;
                        for (int k = 0; k < n; k++) {
                            if (k != j && mat[i][k] == 1) {
                                isRowSpecial = false;
                                break;
                            }
                        }

                        // Check the entire column for 1
                        boolean isColSpecial = true;
                        for (int k = 0; k < m; k++) {
                            if (k != i && mat[k][j] == 1) {
                                isColSpecial = false;
                                break;
                            }
                        }
                        // Increment count if both row and column are special
                        if (isRowSpecial && isColSpecial) {
                            count++;
                        }
                    }
                }
            }

            return count;
        }
        //todo:success
    public static void main(String[] args) {
    }
}

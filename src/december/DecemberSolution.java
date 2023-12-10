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

    public static void main(String[] args) {
    }
}
